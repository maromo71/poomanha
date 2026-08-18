import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        //Programa que recebe dois valores do usuario
        //Efetua a soma e mostra o resultado

        Scanner sc = new Scanner(System.in);
        int a, b, soma;
        System.out.println("Digite o primeiro valor");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o segundo valor");
        b = Integer.parseInt(sc.nextLine());
        soma = a + b;
        System.out.println("Resultado da soma: " + soma);
    }
}
