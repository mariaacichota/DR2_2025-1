package org.example.E05_SistemaBancario;

public class Main {
    public static void main(String[] args) {
        BancoService banco = new BancoService();

        banco.criarConta("Alice", 1000);
        banco.criarConta("Bob", 500);

        banco.exibirSaldo("Alice");
        banco.exibirSaldo("Bob");

        banco.transferir("Alice", "Bob", 200);

        banco.exibirSaldo("Alice");
        banco.exibirSaldo("Bob");
    }
}