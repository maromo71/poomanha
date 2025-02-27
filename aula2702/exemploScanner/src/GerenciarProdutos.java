import java.util.Scanner;

public class GerenciarProdutos {
    public static void main(String[] args) {
        //Criar dois produtos e exibir seus dados
        //Pedir as informações para o usuario
        Scanner input = new Scanner(System.in);
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        System.out.println("Digite o codigo do produto: ");
        p1.codigo = Integer.parseInt(input.nextLine());
        System.out.println("Digite o nome do produto: ");
        p1.nome = input.nextLine();
        System.out.println("Digite o preco do produto: ");
        p1.preco = Double.parseDouble(input.nextLine());
        p1.imprimir();
        System.out.println("Digite o codigo do produto: ");
        p2.codigo = Integer.parseInt(input.nextLine());
        System.out.println("Digite o nome do produto: ");
        p2.nome = input.nextLine();
        System.out.println("Digite o preco do produto: ");
        p2.preco = Double.parseDouble(input.nextLine());
        p2.imprimir();
    }
}