package org.example.E05_SistemaBancario;

import java.util.ArrayList;
import java.util.List;

public class BancoService {
    private List<Conta> contas;

    public BancoService() {
        this.contas = new ArrayList<>();
    }

    public void criarConta(String titular, double saldoInicial) {
        contas.add(new Conta(titular, saldoInicial));
    }

    public Conta buscarConta(String titular) {
        for (Conta conta : contas) {
            if (conta.getTitular().equals(titular)) {
                return conta;
            }
        }
        return null;
    }

    public void transferir(String origem, String destino, double valor) {
        Conta contaOrigem = buscarConta(origem);
        Conta contaDestino = buscarConta(destino);

        if (contaOrigem != null && contaDestino != null && contaOrigem.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Erro na transferência.");
        }
    }

    public void exibirSaldo(String titular) {
        Conta conta = buscarConta(titular);
        if (conta != null) {
            System.out.println("Saldo de " + titular + ": R$ " + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}
