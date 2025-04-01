package com.infnet.DR2_TP2.E07;

public class RelatorioCSV implements Relatorio {
    @Override
    public void gerarCabecalho() {
        System.out.println("Gerando cabeçalho CSV...");
    }

    @Override
    public void gerarCorpo() {
        System.out.println("Gerando corpo CSV...");
    }

    @Override
    public void gerarRodape() {
        System.out.println("Gerando rodapé CSV...");
    }
}

