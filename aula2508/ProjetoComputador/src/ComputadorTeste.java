import java.util.Scanner;

public class ComputadorTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computador computador1 = new Computador();
        System.out.println("Digite a marca do computador: ");
        computador1.setMarca(sc.nextLine());
        System.out.println("Digite o modelo do computador: ");
        computador1.setModelo(sc.nextLine());
        System.out.println("Digite a cor do computador: ");
        computador1.setCor(sc.nextLine());
        System.out.println("Digite o num de serie do computador: ");
        computador1.setNumeroSerie(Long.parseLong(sc.nextLine()));
        System.out.println("Digite o preco do computador: ");
        computador1.setPreco(Double.parseDouble(sc.nextLine()));
        computador1.imprimir();
        computador1.calcularValor();
        computador1.imprimir();
        //alterar valor com um preco que seja positivo
        System.out.println("Digite o novo preco do computador: ");
        double novoPreco = Double.parseDouble(sc.nextLine());
        if(computador1.alterarValor(novoPreco)){
            System.out.println("Preco alterado com sucesso");
        }else{
            System.out.println("Preco invalido. Deve ser positivo");
        }
        computador1.imprimir();
    }
}
