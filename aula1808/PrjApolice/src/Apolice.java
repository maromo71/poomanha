public class Apolice {
    //1. Atributos
    private String nomeSegurado;
    private int idade;
    private double valorPremio;

    //2. Métodos
    public void imprimir() {
        System.out.println("Nome do Segurado: " + nomeSegurado);
        System.out.println("Idade do Segurado: " + idade);
        System.out.printf("Valor do Prêmio: %.2f\n", valorPremio);
    }

    //3. Criar os métodos modificadores de acesso
    //   gettes and setters


    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }
}
