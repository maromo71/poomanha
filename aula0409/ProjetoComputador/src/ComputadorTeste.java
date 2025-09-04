public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.marca = "HP";
        computador1.modelo = "Pavilon";
        computador1.cor = "Prata";
        computador1.numeroSerie  = 1234;
        computador1.preco = 5000;
        computador1.imprimir();
        computador1.calcularValor();
        computador1.imprimir();

        Computador computador2 = new Computador();
        computador2.marca = "IBM";
        computador2.modelo = "Novo";
        computador2.cor = "Preta";
        computador2.numeroSerie  = 2345;
        computador2.preco = 6000;
        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();
        if(computador2.alterarValor(5000)){
            System.out.println("Valor alterado com sucesso");
        }else{
            System.out.println("Erro ao alterar valor");
        }
        computador2.imprimir();
    }
}
