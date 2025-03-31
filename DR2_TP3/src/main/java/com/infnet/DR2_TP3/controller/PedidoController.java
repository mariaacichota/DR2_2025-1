package com.infnet.DR2_TP3.controller;

import com.infnet.DR2_TP3.model.Item;
import com.infnet.DR2_TP3.model.Pedido;

import java.util.List;

public class PedidoController {
    public Pedido criarPedido(String id, List<Item> itens, double desconto, double frete, Pedido.StatusPedido status) {
        return new Pedido(id, itens, desconto, frete, status);
    }

    public Pedido adicionarItem(Pedido pedido, Item novoItem) {
        return pedido.adicionarItem(novoItem);
    }

    public Pedido removerItem(Pedido pedido, Item itemRemover) {
        return pedido.removerItem(itemRemover);
    }

    public double calcularTotal(Pedido pedido) {
        return pedido.getValorTotal();
    }

    public Pedido aplicarDesconto(Pedido pedido, double novoDesconto) {
        return pedido.comDescontoAlterado(novoDesconto);
    }

    public Pedido alterarFrete(Pedido pedido, double novoFrete) {
        return pedido.comFreteAlterado(novoFrete);
    }

    public Pedido atualizarStatusPedido(Pedido pedido, Pedido.StatusPedido novoStatus) {
        return pedido.atualizarStatus(novoStatus);
    }

    public void exibirInformacoesPedido(Pedido pedido) {
        System.out.println("Pedido ID: " + pedido.getId());
        System.out.println("Status: " + pedido.getStatus());
        System.out.println("Valor Total: " + pedido.getValorTotal());

        for (Item item : pedido.getItens()) {
            System.out.println("Item: " + item.getCodigoProduto() + " - Quantidade: " + item.getQuantidade() + " - Preço: " + item.getValorUnitario());
        }
    }
}
