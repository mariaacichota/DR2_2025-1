package com.infnet.DR2_TP3.model;

public class Item {
    private final String codigoProduto;
    private final int quantidade;
    private final double valorUnitario;

    public Item(String codigoProduto, int quantidade, double valorUnitario) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa.");
        }
        if (valorUnitario < 0) {
            throw new IllegalArgumentException("Valor unitário não pode ser negativo.");
        }

        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public Item atualizarQuantidade(int novaQuantidade) {
        if (novaQuantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa.");
        }
        return new Item(this.codigoProduto, novaQuantidade, this.valorUnitario);
    }

    public Item atualizarValorUnitario(double novoValorUnitario) {
        if (novoValorUnitario < 0) {
            throw new IllegalArgumentException("Valor unitário não pode ser negativo.");
        }
        return new Item(this.codigoProduto, this.quantidade, novoValorUnitario);
    }

    public double calcularTotal() {
        return this.quantidade * this.valorUnitario;
    }
}
