package com.infnet.DR2_TP3.controller;

import com.infnet.DR2_TP3.model.Projeto;
import com.infnet.DR2_TP3.model.Sprint;

public class ProjetoController {
    private Projeto projeto;

    public ProjetoController(Projeto projeto) {
        this.projeto = projeto;
    }

    public void adicionarSprint(Sprint sprint) {
        projeto.adicionarSprint(sprint);
    }

    public void removerSprint(Sprint sprint) {
        projeto.removerSprint(sprint);
    }

    public void listarSprints() {
        for (Sprint sprint : projeto.listarSprints()) {
            System.out.println(sprint.getNome());
        }
    }
}
