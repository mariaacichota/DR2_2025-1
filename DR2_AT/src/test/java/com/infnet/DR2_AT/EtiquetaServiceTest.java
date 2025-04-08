package com.infnet.DR2_AT;

import com.infnet.DR2_AT.model.entidade.Entrega;
import com.infnet.DR2_AT.model.enums.TipoFrete;
import com.infnet.DR2_AT.service.EtiquetaService;
import com.infnet.DR2_AT.service.FreteService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EtiquetaServiceTest {

    @Test
    public void deveGerarEtiquetaCorretamente() {
        Entrega entrega = new Entrega("Rua B", 3.0, TipoFrete.PAD, "Marcos");
        FreteService freteService = new FreteService();
        EtiquetaService service = new EtiquetaService(freteService);

        String etiqueta = service.gerarEtiqueta(entrega);
        assertTrue(etiqueta.contains("Destinatário: Marcos"));
        assertTrue(etiqueta.contains("Endereço: Rua B"));
        assertTrue(etiqueta.contains("R$3.60"));
    }

    @Test
    public void deveGerarResumoCorretamente() {
        Entrega entrega = new Entrega("Rua B", 3.0, TipoFrete.ECO, "Marcos");
        EtiquetaService service = new EtiquetaService(new FreteService());
        String resumo = service.gerarResumoPedido(entrega);
        assertTrue(resumo.contains("frete tipo ECO"));
    }
}