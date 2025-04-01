package com.infnet.DR2_TP2.E03;

public class Pedido {
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = (cliente != null) ? cliente : new ClienteNulo();
    }

    public String getNomeCliente() {
        return cliente.getNome();
    }
}
