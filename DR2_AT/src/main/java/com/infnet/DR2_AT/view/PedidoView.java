package com.infnet.DR2_AT.view;

public class PedidoView {
    public static void exibirEtiqueta(String etiqueta) {
        System.out.println("=== ETIQUETA ===\n" + etiqueta);
    }

    public static void exibirResumo(String resumo) {
        System.out.println("\n=== RESUMO DO PEDIDO ===\n" + resumo);
    }

    public static void exibirErro(String mensagem) {
        System.err.println("Erro: " + mensagem);
    }
}