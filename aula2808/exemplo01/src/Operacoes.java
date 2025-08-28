import java.util.Scanner;

public class Operacoes {
    /**
     * Funcao somar - soma de dois valores inteiros
     * @since 2025 agosto
     * @author Maromo
     * @param a Numero inteiro passado como argumento
     * @param b Numero inteiro passado como argumento
     * @return Retorna a soma dos dois valores inteiros
     */
    public static int somar(int a, int b){
        return a + b;
    }

    /*
    Metodo main
    Seria a descricao do que temos de principal
    no metodo abaixo
     */
    public static void main(String[] args) {
        //Objeto leitor para receber dados do teclado
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite outro valor");
        int valor2 = Integer.parseInt(leitor.nextLine());
        int resultado = somar(valor1, valor2);
        System.out.println("Restulado: " + resultado);

    }
}
