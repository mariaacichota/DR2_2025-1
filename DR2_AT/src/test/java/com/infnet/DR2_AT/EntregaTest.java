package com.infnet.DR2_AT;

import com.infnet.DR2_AT.model.entidade.Entrega;
import com.infnet.DR2_AT.model.enums.TipoFrete;
import com.infnet.DR2_AT.model.exceptions.DadosInvalidosException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntregaTest {

    @Test
    public void deveCriarEntregaValida() {
        Entrega e = new Entrega("Rua A", 5.0, TipoFrete.PAD, "Jose");
        assertEquals("Rua A", e.getEndereco());
        assertEquals(5.0, e.getPeso());
        assertEquals(TipoFrete.PAD, e.getTipoFrete());
        assertEquals("Jose", e.getDestinatario());
    }

    @Test
    public void deveLancarErroComPesoInvalido() {
        assertThrows(DadosInvalidosException.class, () -> new Entrega("Rua A", -2, TipoFrete.PAD, "Jose"));
    }

    @Test
    public void deveLancarErroComEnderecoVazio() {
        assertThrows(DadosInvalidosException.class, () -> new Entrega("", 2.5, TipoFrete.PAD, "Jose"));
    }

    @Test
    public void deveLancarErroComTipoFreteNulo() {
        assertThrows(DadosInvalidosException.class, () -> new Entrega("Rua A", 2.5, null, "Jose"));
    }
}