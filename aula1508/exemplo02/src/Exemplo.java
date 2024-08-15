import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        //Manipular leitura de I/O
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        /*
        As linhas abaixo, x = recebe um valor
        convertido e depois a variavel
        soma = o valor entrado pelo usuario +
        valor 10.
         */
        int x = Integer.parseInt(sc.nextLine());
        int soma = x + 10;
        System.out.println("Novo valor: " + soma);
        int resultado = somar(10, 5);

    }

    /**
     * @since ago 2024
     * Função para somar dois valores
     * @param a - primeiro valor
     * @param b - segundo valro
     * @return valor somado, ou seja a+b.
     */
    public static int somar(int a, int b) {
        return a + b;
    }
}
