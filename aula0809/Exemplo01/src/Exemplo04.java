import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] casais = new String[5][2];
        for(int i=0; i<5; i++){
            System.out.printf("%d.) casal \n", i+1);
            for(int j=0; j<2; j++){
                System.out.printf("Digite nome da %d.) pessoa: ", j+1);
                casais[i][j] = sc.nextLine();
            }
        }
        //Apresento o nome dos casais
        System.out.println("Imprimindo os casais da festa: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-15s | %-15s \n", casais[i][0], casais[i][1]);
        }
        System.out.println("---------------------------------");
    }

}
