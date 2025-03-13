import java.util.Arrays;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] v = new int[10];
        //pedir 10 valores ao usuario
        for (int i = 0; i < v.length; i++) {
            System.out.println("Digite o valor da posicao " + (i + 1));
            v[i] = Integer.parseInt(entrada.nextLine());
        }
        //ordenar
        Arrays.sort(v);
        //percorrer
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Pos[%d]= %d \n", i, v[i]);
        }
    }
}
