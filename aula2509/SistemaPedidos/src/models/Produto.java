package models;

public class Produto {
    private int id;
    private String descricao;
    private double preco;

    public Produto(int id, String descricao, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Id: " + id + " | Descricao: " + descricao + " | Preco: " + preco;
    }
}
