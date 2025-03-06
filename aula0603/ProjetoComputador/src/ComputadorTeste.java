public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.setMarca("HP");
        computador1.setModelo("Novo Modelo");
        computador1.setCor("Prata");
        computador1.setPreco(5000.0);
        computador1.setNumeroSerie(1234);
        //imprimir
        computador1.imprimir();
        computador1.calcularValor();
        computador1.imprimir();
        //Proximo IBM
        Computador computador2 = new Computador();
        computador2.setMarca("IBM");
        computador2.setModelo("Modelo Velho");
        computador2.setCor("Razor");
        computador2.setPreco(5000.0);
        computador2.setNumeroSerie(345);
        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();
        if(computador2.alterarValor(-5000)){
            System.out.println("Preco Alterado");
        }else{
            System.out.println("Preco deve maior que 0");
        }
        computador2.imprimir();
    }
}