public class Produto {
    //atributos
    public int codigo;
    public String nome;
    public double preco;
    public static double taxaArmazenamento = 0.05;

    //metodos
    private double valorArmazenamento(){
        return preco * taxaArmazenamento;
    }

    public void imprimir(){
        System.out.println("codigo = " + codigo);
        System.out.println("nome = " + nome);
        System.out.println("preco = " + preco);
        System.out.println("valor Armazenamento = " + valorArmazenamento());
    }
}
