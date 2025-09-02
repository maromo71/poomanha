public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.marca = "Hp";
        computador1.modelo = "Novo";
        computador1.cor = "Prata";
        computador1.numeroSerie = 1234;
        computador1.preco = 1000.0;
        //invocar o metodo
        computador1.imprimir();
        //invocar o metodo
        computador1.calcularValor();
        System.out.println();
        computador1.imprimir();

        Computador computador2 = new Computador();
        computador2.marca = "IBM";
        computador2.modelo = "Velho";
        computador2.cor = "Prata";
        computador2.numeroSerie = 2345;
        computador2.preco = 5000.0;
        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();
        if(computador2.alterarValor(3000)){
            System.out.println("Valor Alterado");
        }else{
            System.out.println("Valor invalido");
        }
        computador2.imprimir();

    }
}
