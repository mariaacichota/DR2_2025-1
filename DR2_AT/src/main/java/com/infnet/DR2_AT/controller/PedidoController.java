package com.infnet.DR2_AT.controller;

import com.infnet.DR2_AT.model.entidade.Entrega;
import com.infnet.DR2_AT.model.enums.TipoFrete;
import com.infnet.DR2_AT.service.*;
import com.infnet.DR2_AT.view.PedidoView;

public class PedidoController {

    private final EtiquetaService etiquetaService;

    public PedidoController() {
        FreteService freteService = new FreteService();
        this.etiquetaService = new EtiquetaService(freteService);
    }

    public void processarPedido(String endereco, double peso, String tipoFrete, String destinatario) {
        try {
            TipoFrete tipo = TipoFrete.valueOf(tipoFrete.toUpperCase());
            Entrega entrega = new Entrega(endereco, peso, tipo, destinatario);
            PedidoView.exibirEtiqueta(etiquetaService.gerarEtiqueta(entrega));
            PedidoView.exibirResumo(etiquetaService.gerarResumoPedido(entrega));
        } catch (Exception e) {
            PedidoView.exibirErro(e.getMessage());
        }
    }
}