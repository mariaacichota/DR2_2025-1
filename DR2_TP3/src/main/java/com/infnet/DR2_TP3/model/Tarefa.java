package com.infnet.DR2_TP3.model;

public class Tarefa {
    public enum Status {TODO, IN_PROGRESS, DONE}

    private String titulo;
    private String descricao;
    private Status status;
    private Usuario responsavel;

    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = Status.TODO;
    }

    public void atribuirResponsavel(Usuario usuario) {
        this.responsavel = usuario;
    }

    public void alterarStatus(Status status) {
        this.status = status;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Status: " + status);
        System.out.println("Responsável: " + (responsavel != null ? responsavel.getNome() : "Não atribuído"));
    }

    public String getTitulo() {
        return titulo;
    }

    public Status getStatus() {
        return status;
    }
}
