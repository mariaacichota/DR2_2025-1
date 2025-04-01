package com.infnet.DR2_TP2.E08;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean podeComprar(double valor) {
        return saldo >= valor;
    }

    public void realizarCompra(double valor) {
        if (!podeComprar(valor)) {
            throw new IllegalArgumentException("Saldo insuficiente para a compra.");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
