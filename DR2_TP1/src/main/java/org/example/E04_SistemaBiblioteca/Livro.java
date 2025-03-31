package org.example.E04_SistemaBiblioteca;

class Livro {
    private String titulo;
    private boolean disponibilidade;
    public Livro(String titulo) {
        this.titulo = titulo;
        this.disponibilidade = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void emprestar() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("Livro emprestado: " + titulo);
        } else {
            System.out.println("Livro não disponível.");
        }
    }

    public void devolver() {
        disponibilidade = true;
        System.out.println("Livro devolvido: " + titulo);
    }
}
