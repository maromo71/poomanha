package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//item 1b
public class Carrinho {
    private  int idCarrinho;
    private Date dataCarrinho;
    private List<Produto> itens = new ArrayList<Produto>();

    public int getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public Date getDataCarrinho() {
        return dataCarrinho;
    }

    public void setDataCarrinho(Date dataCarrinho) {
        this.dataCarrinho = dataCarrinho;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }

    //listar produtos
    public void listarProdutos(){
        for (Produto produto : itens) {
            System.out.println("Dados do produto: ");
            System.out.println("Id Produto: " + produto.getIdProduto());
            System.out.println("Nome do Produto: " + produto.getNomeProduto());
            System.out.println("Preço do Produto: " + produto.getPreco());
        }
    }

    public void adicionarProduto(Produto produto){
        itens.add(produto);
    }
}
