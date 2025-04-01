package com.infnet.DR2_TP2.E07;

public class RelatorioFactory {
    public static Relatorio criarRelatorio(String tipo) {
        switch (tipo.toUpperCase()) {
            case "PDF":
                return new RelatorioPDF();
            case "CSV":
                return new RelatorioCSV();
            case "JSON":
                return new RelatorioJSON();
            default:
                throw new IllegalArgumentException("Tipo de relatório desconhecido: " + tipo);
        }
    }
}
