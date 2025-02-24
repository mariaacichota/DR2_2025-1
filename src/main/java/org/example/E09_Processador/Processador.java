package org.example.E09_Processador;

public class Processador {
    public void executar(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("Entrada inválida: o valor não pode ser nulo ou vazio.");
        }
        System.out.println("Processando: " + valor);
    }
}
