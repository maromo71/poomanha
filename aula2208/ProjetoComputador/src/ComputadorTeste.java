import model.Computador;

public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.marca = "HP";
        computador1.modelo = "Computador";
        computador1.numeroSerie = 234;
        computador1.cor = "Preto";
        computador1.preco = 2000.0;
        //executar o imprimir
        computador1.imprimir();
        //executar o calcularValor
        computador1.calcularValor();
        //executar o imprimir novamente
        computador1.imprimir();

        //Computador 2
        Computador computador2 = new Computador();
        computador2.marca = "IBM";
        computador2.modelo = "Computador Novo";
        computador2.numeroSerie = 123;
        computador2.cor = "Prata";
        computador2.preco = 5000.0;
        //executar o imprimir
        computador2.imprimir();
        //calcular valor
        computador2.calcularValor();
        //executar o imprimir
        computador2.imprimir();
        //alterar o preco para um valor positivo
        if(computador2.alterarValor(3500.0)){
            System.out.println("Alterado com sucesso!");
        }else{
            System.out.println("Produto com preço NÃO alterado!");
        }
        computador2.imprimir();
    }
}
