package org.example.E10_Servico;

public class Servico {
    public void processar(String dado) {
        if (dado == null || dado.trim().isEmpty()) {
            throw new IllegalArgumentException("Entrada inválida: não pode ser nula ou vazia.");
        }

        System.out.println("Processando: " + dado.toUpperCase());
    }
}
