package com.infnet.DR2_TP2.E11;

import java.util.*;

public class PedidoService {

    public enum StatusPedido {
        PENDENTE, PROCESSANDO, ENVIADO, ENTREGUE
    }

    private final Map<StatusPedido, Runnable> acoesPorStatus;

    public PedidoService() {
        acoesPorStatus = new EnumMap<>(StatusPedido.class);
        acoesPorStatus.put(StatusPedido.PENDENTE, () -> System.out.println("O pedido está pendente."));
        acoesPorStatus.put(StatusPedido.PROCESSANDO, () -> System.out.println("O pedido está sendo processado."));
        acoesPorStatus.put(StatusPedido.ENVIADO, () -> System.out.println("O pedido foi enviado."));
        acoesPorStatus.put(StatusPedido.ENTREGUE, () -> System.out.println("O pedido foi entregue."));
    }

    public void atualizarStatus(StatusPedido status) {
        Runnable acao = acoesPorStatus.get(status);
        if (acao != null) {
            acao.run();
        } else {
            throw new IllegalArgumentException("Status desconhecido: " + status);
        }
    }
}