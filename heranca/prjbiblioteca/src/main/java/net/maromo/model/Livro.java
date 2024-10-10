package net.maromo.model;

public class Livro {
    private int idLivro;
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(int idLivro, String titulo, String autor) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; // disponivel no momento da criacao
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Dados do Livro \n" +
                "IdLivro=" + idLivro + "\n" +
                "Titulo=" + titulo + "\n" +
                "Autor=" + autor + "\n" +
                "Disponibilidade=" + disponivel + "\n";
    }
}