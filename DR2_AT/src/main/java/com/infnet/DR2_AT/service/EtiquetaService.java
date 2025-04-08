package com.infnet.DR2_AT.service;

import com.infnet.DR2_AT.model.entidade.Entrega;

public class EtiquetaService {

    private final FreteService freteService;

    public EtiquetaService(FreteService freteService) {
        this.freteService = freteService;
    }

    public String gerarEtiqueta(Entrega entrega) {
        return String.format("""
            Destinatário: %s
            Endereço: %s
            Valor do Frete: R$%.2f
        """, entrega.getDestinatario(), entrega.getEndereco(), freteService.calcularFrete(entrega));
    }

    public String gerarResumoPedido(Entrega entrega) {
        return String.format("Pedido para %s com frete tipo %s no valor de R$%.2f",
                entrega.getDestinatario(),
                entrega.getTipoFrete(),
                freteService.calcularFrete(entrega));
    }
}