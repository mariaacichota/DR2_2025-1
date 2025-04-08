package com.infnet.DR2_AT.model.enums;

import com.infnet.DR2_AT.model.frete.CalculadoraFrete;
import com.infnet.DR2_AT.model.frete.FreteEconomico;
import com.infnet.DR2_AT.model.frete.FreteExpresso;
import com.infnet.DR2_AT.model.frete.FretePadrao;

public enum TipoFrete {
    EXP {
        public CalculadoraFrete getCalculadora() {
            return new FreteExpresso();
        }
    },
    PAD {
        public CalculadoraFrete getCalculadora() {
            return new FretePadrao();
        }
    },
    ECO {
        public CalculadoraFrete getCalculadora() {
            return new FreteEconomico();
        }
    };

    public abstract CalculadoraFrete getCalculadora();
}