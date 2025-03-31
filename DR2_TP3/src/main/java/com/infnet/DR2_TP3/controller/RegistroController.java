package com.infnet.DR2_TP3.controller;

import com.infnet.DR2_TP3.model.Registro;

import java.math.BigDecimal;

public class RegistroController {
    public Registro aplicarDesconto(Registro registro, BigDecimal novoDesconto) {
        return registro.aplicarDesconto(novoDesconto);
    }

    public Registro atualizarStatus(Registro registro, Registro.StatusRegistro novoStatus) {
        return registro.atualizarStatus(novoStatus);
    }

    public void exibirInformacoesRegistro(Registro registro) {
        System.out.println("ID: " + registro.getId());
        System.out.println("Status: " + registro.getStatus());
        System.out.println("Valor: " + registro.getValor());
        System.out.println("Data de Criação: " + registro.getDataCriacao());
    }

}
