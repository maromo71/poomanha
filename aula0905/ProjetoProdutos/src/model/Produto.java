package model;

public class Produto implements Comparable<Produto> {
    private int codigo;
    private String descricao;
    private int quantidade;
    private double valor;

    public Produto(int codigo, String descricao,  double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = 0;
    }

    public Produto(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto: " + codigo + "\n" +
                "Descrição: " + descricao + "\n" +
                "Quantidade: " + quantidade + "\n"+
                "Valor R$ " + valor + "\n";
    }

    @Override
    public boolean equals(Object o) {
        return ((o instanceof Produto) && ((Produto)o).codigo== this.codigo);
    }

    @Override
    public int hashCode() {
        return (int) (Math.random() * 1000000);
    }

    @Override
    public int compareTo(Produto o) {
        return Integer.compare(this.codigo, o.codigo);
    }

    //Métodos que representam a logica do programa
    public void comprar(int qtdComprada){
        quantidade += qtdComprada;
    }

    public void vender(int qtdVendida){
        quantidade -= qtdVendida;
    }

    public int getEstoque(){
        return quantidade;
    }
}
