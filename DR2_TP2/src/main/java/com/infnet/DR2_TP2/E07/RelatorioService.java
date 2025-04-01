package com.infnet.DR2_TP2.E07;

public class RelatorioService {
    public void gerarRelatorio(String tipo) {
        try {
            Relatorio relatorio = RelatorioFactory.criarRelatorio(tipo);
            relatorio.gerarCabecalho();
            relatorio.gerarCorpo();
            relatorio.gerarRodape();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

