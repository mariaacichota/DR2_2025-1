package com.infnet.DR2_TP2.E07;

public class RelatorioPDF implements Relatorio {
    @Override
    public void gerarCabecalho() {
        System.out.println("Gerando cabeçalho PDF...");
    }

    @Override
    public void gerarCorpo() {
        System.out.println("Gerando corpo PDF...");
    }

    @Override
    public void gerarRodape() {
        System.out.println("Gerando rodapé PDF...");
    }
}
