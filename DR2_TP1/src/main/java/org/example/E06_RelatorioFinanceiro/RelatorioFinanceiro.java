package org.example.E06_RelatorioFinanceiro;

import java.util.List;

public class RelatorioFinanceiro {
    public void gerarRelatorio(List<String> clientes, List<Double> saldos) {
        imprimirCabecalho();
        imprimirDetalhes(clientes, saldos);
        imprimirRodape();
    }

    private void imprimirCabecalho() {
        System.out.println("=== Relatório Financeiro ===");
    }

    private void imprimirDetalhes(List<String> clientes, List<Double> saldos) {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.printf("Cliente: %-15s | Saldo: R$ %.2f%n", clientes.get(i), saldos.get(i));
        }
    }

    private void imprimirRodape() {
        System.out.println("===========================");
        System.out.println("Fim do Relatório");
    }
}
