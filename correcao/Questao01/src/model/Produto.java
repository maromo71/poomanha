package model;

//item 1a
public class Produto {
    //atributos
    private int idProduto;
    private double preco;
    private int qtdEstoque;
    private String nomeProduto;
    private String principalFornecedor;
    private boolean ativo;

    //get - set
    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getPrincipalFornecedor() {
        return principalFornecedor;
    }

    public void setPrincipalFornecedor(String principalFornecedor) {
        this.principalFornecedor = principalFornecedor;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
