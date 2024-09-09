import model.Meses;
import model.Produto;

import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setId(1);
        p.setNome("Bola");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o mes da compra do produto: ");
        String mes = sc.nextLine();

        p.setMesAquisicao(Meses.valueOf(mes));
        System.out.println(p.getId());
        System.out.println(p.getNome());
        System.out.println(p.getMesAquisicao());
    }
}
