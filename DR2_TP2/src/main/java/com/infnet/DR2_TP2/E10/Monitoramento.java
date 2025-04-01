package com.infnet.DR2_TP2.E10;

public class Monitoramento {
    private int contadorAcessos = 0;

    public int getContadorAcessos() {
        return contadorAcessos;
    }

    public void incrementarAcessos() {
        contadorAcessos++;
    }
}

