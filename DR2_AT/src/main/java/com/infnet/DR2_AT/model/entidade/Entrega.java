package com.infnet.DR2_AT.model.entidade;

import com.infnet.DR2_AT.model.enums.TipoFrete;
import com.infnet.DR2_AT.model.exceptions.DadosInvalidosException;

public class Entrega {
    private final String endereco;
    private final double peso;
    private final TipoFrete tipoFrete;
    private final String destinatario;

    public Entrega(String endereco, double peso, TipoFrete tipoFrete, String destinatario) {
        if (endereco == null || endereco.isBlank()) throw new DadosInvalidosException("Endereço inválido.");
        if (peso <= 0) throw new DadosInvalidosException("Peso deve ser positivo.");
        if (tipoFrete == null) throw new DadosInvalidosException("Tipo de frete não pode ser nulo.");
        if (destinatario == null || destinatario.isBlank()) throw new DadosInvalidosException("Destinatário inválido.");

        this.endereco = endereco;
        this.peso = peso;
        this.tipoFrete = tipoFrete;
        this.destinatario = destinatario;
    }

    public String getEndereco() { return endereco; }
    public double getPeso() { return peso; }
    public TipoFrete getTipoFrete() { return tipoFrete; }
    public String getDestinatario() { return destinatario; }
}