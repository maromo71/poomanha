import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String texto;
        System.out.println("Digite um texto: ");
        texto = ler.nextLine();
        System.out.println("Digite um valor: ");
        int valor = ler.nextInt();

        System.out.println("Digite uma letra: ");
        //Lendo até o ultimo caractere digitado
        //excetuando o (enter) - so atribui o
        //indice zero a letra (ou, seja a primeira ]
        //letra
        char letra = ler.next().charAt(0);
        //Limpa o enter que estava sobrando
        ler.nextLine();
        System.out.println("Digite uma palavra: ");
        String palavra = ler.nextLine();
        System.out.println("Texto: " + texto);
        System.out.println("Valor: " + valor);
        System.out.println("Letra: " + letra);
        System.out.println("Palavra: " + palavra);
        ler.close();
    }
}
