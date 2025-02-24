package org.example.E02_Processador;

public class Processador {

    public void validarDado(String dado) {
        if (!isDadoValido(dado)) {
            throw new IllegalArgumentException("Entrada inválida: dado inválido ou vazio.");
        }

        if (dado.length() > 10) {
            System.out.println("Dado válido: " + dado);
        } else {
            System.out.println("Erro: Dado muito curto.");
        }
    }

    private boolean isDadoValido(String dado) {
        return dado != null && !dado.isEmpty();
    }
}
