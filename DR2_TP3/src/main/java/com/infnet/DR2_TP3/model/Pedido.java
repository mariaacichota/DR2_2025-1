package com.infnet.DR2_TP3.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private final String id;
    private final List<Item> itens;
    private final double desconto;
    private final double frete;
    private final double valorTotal;
    private final StatusPedido status;

    public enum StatusPedido {
        PENDENTE, PROCESSANDO, CONCLUIDO
    }

    public Pedido(String id, List<Item> itens, double desconto, double frete, StatusPedido status) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID do pedido não pode ser nulo ou vazio.");
        }
        if (itens == null || itens.isEmpty()) {
            throw new IllegalArgumentException("O pedido deve ter pelo menos um item.");
        }

        this.id = id;
        this.itens = List.copyOf(itens);
        this.desconto = desconto;
        this.frete = frete;
        this.valorTotal = calcularTotal();
        this.status = status != null ? status : StatusPedido.PENDENTE;
    }

    public String getId() {
        return id;
    }

    public List<Item> getItens() {
        return itens;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getFrete() {
        return frete;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public double calcularTotal() {
        double totalItens = itens.stream().mapToDouble(Item::calcularTotal).sum();
        double totalComDesconto = totalItens - (totalItens * (desconto / 100));
        return totalComDesconto + frete;
    }

    public Pedido comDescontoAlterado(double novoDesconto) {
        return new Pedido(this.id, this.itens, novoDesconto, this.frete, StatusPedido.PROCESSANDO);
    }

    public Pedido comFreteAlterado(double novoFrete) {
        return new Pedido(this.id, this.itens, this.desconto, novoFrete, StatusPedido.PROCESSANDO);
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Pedido atualizarStatus(StatusPedido novoStatus) {
        return new Pedido(this.id, this.itens, this.desconto, this.frete, novoStatus);
    }

    public Pedido adicionarItem(Item novoItem) {
        List<Item> novosItens = new ArrayList<>(this.itens);
        novosItens.add(novoItem);
        return new Pedido(this.id, novosItens, this.desconto, this.frete, this.status);
    }

    public Pedido removerItem(Item itemRemover) {
        List<Item> novosItens = new ArrayList<>(this.itens);
        novosItens.remove(itemRemover);
        return new Pedido(this.id, novosItens, this.desconto, this.frete, this.status);
    }
}
