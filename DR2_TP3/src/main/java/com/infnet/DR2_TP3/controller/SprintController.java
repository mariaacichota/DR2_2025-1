package com.infnet.DR2_TP3.controller;

import com.infnet.DR2_TP3.model.Sprint;
import com.infnet.DR2_TP3.model.Tarefa;

public class SprintController {
    private Sprint sprint;

    public SprintController(Sprint sprint) {
        this.sprint = sprint;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        sprint.adicionarTarefa(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        sprint.removerTarefa(tarefa);
    }

    public void listarTarefas() {
        for (Tarefa tarefa : sprint.listarTarefas()) {
            System.out.println(tarefa.getTitulo());
        }
    }
}
