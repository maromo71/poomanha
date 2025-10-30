package model;

import exceptions.ProdutoException;

public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidade;

    public Produto(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = 0;
    }
    public void registrarEntrada(int qtd) throws ProdutoException {
        if(qtd <= 0){
            throw new ProdutoException("RF01EX01");
        }
        this.quantidade += qtd;
    }

    public void registrarSaida(int qtd) throws ProdutoException {
        if(qtd > quantidade){
            throw new ProdutoException("RF01EX02");
        }
        this.quantidade -= qtd;
    }

    @Override
    public String toString() {
        return String.format(
                "Codigo: %5d | Descricao: %20s | Preco: %.2f | Qtd: %5d",
                codigo, descricao, preco, quantidade
        );
    }
}
