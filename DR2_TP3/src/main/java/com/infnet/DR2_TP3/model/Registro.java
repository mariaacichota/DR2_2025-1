package com.infnet.DR2_TP3.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Registro {

    private final String id;
    private final BigDecimal valor;
    private final LocalDateTime dataCriacao;
    private final StatusRegistro status;

    public enum StatusRegistro {
        PENDENTE, APROVADO, CANCELADO
    }

    public Registro(String id, BigDecimal valor, LocalDateTime dataCriacao, StatusRegistro status) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID do registro não pode ser nulo ou vazio.");
        }
        if (valor == null || valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Valor não pode ser nulo ou negativo.");
        }
        if (dataCriacao == null) {
            throw new IllegalArgumentException("Data de criação não pode ser nula.");
        }
        if (status == null) {
            throw new IllegalArgumentException("Status não pode ser nulo.");
        }

        this.id = id;
        this.valor = valor;
        this.dataCriacao = dataCriacao;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public StatusRegistro getStatus() {
        return status;
    }

    public Registro atualizarStatus(StatusRegistro novoStatus) {
        return new Registro(this.id, this.valor, this.dataCriacao, novoStatus);
    }

    public Registro aplicarDesconto(BigDecimal percentualDesconto) {
        if (percentualDesconto == null || percentualDesconto.compareTo(BigDecimal.ZERO) < 0 || percentualDesconto.compareTo(BigDecimal.valueOf(100)) > 0) {
            throw new IllegalArgumentException("Percentual de desconto deve ser entre 0 e 100.");
        }
        BigDecimal desconto = valor.multiply(percentualDesconto).divide(BigDecimal.valueOf(100));
        BigDecimal novoValor = valor.subtract(desconto);
        return new Registro(this.id, novoValor, this.dataCriacao, this.status);
    }
}
