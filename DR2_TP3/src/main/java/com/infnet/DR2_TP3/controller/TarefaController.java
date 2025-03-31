package com.infnet.DR2_TP3.controller;

import com.infnet.DR2_TP3.model.Tarefa;
import com.infnet.DR2_TP3.model.Usuario;

public class TarefaController {
    private Tarefa tarefa;

    public TarefaController(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public void atribuirResponsavel(Usuario usuario) {
        tarefa.atribuirResponsavel(usuario);
    }

    public void alterarStatus(Tarefa.Status status) {
        tarefa.alterarStatus(status);
    }

    public void exibirDetalhes() {
        tarefa.exibirDetalhes();
    }
}
