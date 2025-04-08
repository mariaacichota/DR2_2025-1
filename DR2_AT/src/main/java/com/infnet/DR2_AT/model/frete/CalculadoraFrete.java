package com.infnet.DR2_AT.model.frete;

import com.infnet.DR2_AT.model.entidade.Entrega;

public interface CalculadoraFrete {
    double calcular(Entrega entrega);
}