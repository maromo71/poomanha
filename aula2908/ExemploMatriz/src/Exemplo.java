import java.sql.SQLOutput;
import java.util.Scanner;

public class Exemplo {
    private static final int DIML = 3;
    private static final int DIMC = 2;

    public static void main(String[] args) {
        //Entrada exemplo
        Scanner leitor = new Scanner(System.in);
        String[][] casais = new String[3][2];
        for (int i = 0; i < DIML ; i++) {
            System.out.println("Próximo casal: ");
            for (int j = 0; j < DIMC; j++) {
                System.out.printf("Digite o nome do cônjuge %d \n", j+1);
                casais[i][j] = leitor.nextLine();
            }
            System.out.println("-----------------------");
        }
        //imprimir os dados dos casais
        for (int i = 0; i < DIML ; i++) {
            System.out.printf("Dados do casal %d\n", (i+1));
            for (int j = 0; j < DIMC; j++) {
                System.out.printf("%-15s ", casais[i][j]);
                if(j == 0) System.out.printf(" - ");
            }
            System.out.println("\n----------------------");
        }
    }
}


