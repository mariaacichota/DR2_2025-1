package org.example.E03_Carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco, int quantidade) {
        produtos.add(new Produto(nome, preco, quantidade));
    }

    public void calcularTotal() {
        double total = produtos.stream().mapToDouble(Produto::calcularSubtotal).sum();
        System.out.println("=== Carrinho de Compras ===");
        produtos.forEach(System.out::println);
        System.out.println("Total da compra: R$ " + total);
    }
}
