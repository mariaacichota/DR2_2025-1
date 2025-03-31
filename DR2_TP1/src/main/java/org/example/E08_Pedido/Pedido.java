package org.example.E08_Pedido;

public class Pedido {
    private final int id;
    private String descricao;
    private double valor;

    public Pedido(int id, String descricao, double valor) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição do pedido não pode ser vazia.");
        }
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do pedido não pode ser negativo.");
        }

        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição do pedido não pode ser vazia.");
        }
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do pedido não pode ser negativo.");
        }
        this.valor = valor;
    }
}
