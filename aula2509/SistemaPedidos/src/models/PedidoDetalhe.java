package models;

public class PedidoDetalhe {
    private Produto produto;
    private int quantidade;
    private double precoUnitario; //Preco no momento da compra

    public PedidoDetalhe(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPreco(); // garante o preco daquele momento
    }

    //Unico método (a mais) criado - devolve o subtotal do item pedido
    public double getSubtotal(){
        return this.precoUnitario * this.quantidade;
    }
    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    @Override
    public String toString() {
        return String.format(" - Produto: %s | Qtd: %d | Preco Unit. R$ %.2f | Subtotal: R$ %.2f",
                produto.getDescricao(), quantidade, precoUnitario, getSubtotal());
    }
}
