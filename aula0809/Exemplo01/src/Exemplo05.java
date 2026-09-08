import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        //Como nao se deve fazer.
        Produto[] produtos = new Produto[5];
        Scanner sc = new Scanner(System.in);
        produtos[0] = new Produto();
        System.out.println("Digite a descricao do produto: ");
        produtos[0].setDescricao(sc.nextLine());
        System.out.println("Digite o preco do produto: ");
        produtos[0].setPreco(Double.parseDouble(sc.nextLine()));

        //imprimir
        produtos[0].imprimir();

        //Veja o exemplo Exemplo06
    }
}
