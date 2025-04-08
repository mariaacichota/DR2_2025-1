package com.infnet.DR2_AT.model.frete;

import com.infnet.DR2_AT.model.entidade.Entrega;

public class FretePadrao implements CalculadoraFrete {
    public double calcular(Entrega entrega) {
        return entrega.getPeso() * 1.2;
    }
}
