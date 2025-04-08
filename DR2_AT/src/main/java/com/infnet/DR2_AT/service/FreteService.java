package com.infnet.DR2_AT.service;

import com.infnet.DR2_AT.model.entidade.Entrega;
import com.infnet.DR2_AT.model.frete.CalculadoraFrete;

public class FreteService {
    public double calcularFrete(Entrega entrega) {
        CalculadoraFrete calculadora = entrega.getTipoFrete().getCalculadora();
        return calculadora.calcular(entrega);
    }

    public boolean isFreteGratis(Entrega entrega) {
        return entrega.getTipoFrete().name().equals("ECO") && entrega.getPeso() < 2;
    }

    public Entrega aplicarPromocaoPeso(Entrega entrega) {
        double novoPeso = entrega.getPeso() > 10 ? entrega.getPeso() - 1 : entrega.getPeso();
        return new Entrega(entrega.getEndereco(), novoPeso, entrega.getTipoFrete(), entrega.getDestinatario());
    }
}