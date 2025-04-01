package com.infnet.DR2_TP2.E07;

public class RelatorioJSON implements Relatorio {
    @Override
    public void gerarCabecalho() {
        System.out.println("Gerando cabeçalho JSON...");
    }

    @Override
    public void gerarCorpo() {
        System.out.println("Gerando corpo JSON...");
    }

    @Override
    public void gerarRodape() {
        System.out.println("Gerando rodapé JSON...");
    }
}

