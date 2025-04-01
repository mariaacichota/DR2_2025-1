package com.infnet.DR2_TP2.E04;

public class Ajuste {
    public Produto aplicarDesconto(Produto produto) {
        double novoPreco = produto.getPreco() - 10;
        return new Produto(produto.getNome(), novoPreco);
    }
}