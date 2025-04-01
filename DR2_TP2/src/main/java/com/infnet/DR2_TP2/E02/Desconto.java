package com.infnet.DR2_TP2.E02;

public class Desconto {
    private static final double LIMIAR_DESCONTO = 1000.0;
    private static final double PERCENTUAL_DESCONTO = 0.9;

    public double calcular(double preco) {
        if (deveAplicarDesconto(preco)) {
            return aplicarDesconto(preco);
        }
        return preco;
    }

    private boolean deveAplicarDesconto(double preco) {
        return preco >= LIMIAR_DESCONTO;
    }

    private double aplicarDesconto(double preco) {
        return preco * PERCENTUAL_DESCONTO;
    }
}
