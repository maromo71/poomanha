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

    //4. Metodo com logica de programação

    /**
     * Função para cálculo do premio ao beneficiário
     * POr faixa de idade.
     * Até 25 anos não desconta percentual. Recebe Premio integral
     * de 26 a 49 recebe 75% do premio
     * de 50 pra cima recebe 50% do premio
     * @return valor do premio que deve ser pago ao beneficiário.
     */
    public double pagarPremioBeneficiario(){
        if(idade < 25 ){
            return valorPremio;
        }
        if(idade <50){
            return valorPremio * 0.75;
        }
        return valorPremio *.5;
    }
}
