package model;

public class Produto {
    private int id;
    private String nome;
    private Meses mesAquisicao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Meses getMesAquisicao() {
        return mesAquisicao;
    }

    public void setMesAquisicao(Meses mesAquisicao) {
        this.mesAquisicao = mesAquisicao;
    }
}
