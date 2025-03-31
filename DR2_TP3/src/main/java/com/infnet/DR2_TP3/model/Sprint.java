package com.infnet.DR2_TP3.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sprint {
    private String nome;
    private Date inicio;
    private Date fim;
    private List<Tarefa> tarefas;

    public Sprint(String nome, Date inicio, Date fim) {
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public List<Tarefa> listarTarefas() {
        return tarefas;
    }

    public String getNome() {
        return nome;
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFim() {
        return fim;
    }
}
