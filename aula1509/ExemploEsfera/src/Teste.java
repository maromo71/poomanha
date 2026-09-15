import model.Esfera;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Esfera esfera = new Esfera();

        System.out.println("Digite o valor do raio: ");
        esfera.setRaio(Double.parseDouble(sc.nextLine()));

        System.out.println("Volume da esfera: ");
        System.out.println(esfera.calcularVolumeEsfera());
    }
}
