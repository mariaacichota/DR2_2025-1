package com.infnet.DR2_AT;

import com.infnet.DR2_AT.model.entidade.Entrega;
import com.infnet.DR2_AT.model.enums.TipoFrete;
import com.infnet.DR2_AT.service.FreteService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FreteServiceTest {

    @Test
    public void testCalculoFreteExpresso() {
        Entrega entrega = new Entrega("Rua X", 5.0, TipoFrete.EXP, "Carlos");
        FreteService service = new FreteService();
        assertEquals(17.5, service.calcularFrete(entrega), 0.01);
    }

    @Test
    public void testFreteGratis() {
        Entrega entrega = new Entrega("Rua Y", 1.5, TipoFrete.ECO, "Paula");
        FreteService service = new FreteService();
        assertTrue(service.isFreteGratis(entrega));
    }

    @Test
    public void testAplicarPromocaoPeso() {
        Entrega entrega = new Entrega("Rua Z", 12.0, TipoFrete.PAD, "João");
        FreteService service = new FreteService();
        Entrega novaEntrega = service.aplicarPromocaoPeso(entrega);
        assertEquals(11.0, novaEntrega.getPeso(), 0.01);
    }

    @Test
    public void testPromocaoNaoAplicadaPesoMenorQue10() {
        Entrega entrega = new Entrega("Rua Z", 8.0, TipoFrete.PAD, "João");
        FreteService service = new FreteService();
        Entrega novaEntrega = service.aplicarPromocaoPeso(entrega);
        assertEquals(8.0, novaEntrega.getPeso(), 0.01);
    }
}