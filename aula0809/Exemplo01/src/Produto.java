public class Produto {
    private String descricao;
    private double preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimir(){
        System.out.println("Descricao: " + descricao);
        System.out.println("Preco: " + preco);
        System.out.println("------------------------");
    }
}
