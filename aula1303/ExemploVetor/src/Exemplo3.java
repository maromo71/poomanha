import java.util.Arrays;

public class Exemplo3 {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        //preencher todas as posicoes com o valor 99.
        Arrays.fill(vetor, 99);

        for(int x : vetor){
            System.out.println(x);
        }
    }
}
