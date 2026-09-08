import java.util.Arrays;

public class Exemplo03 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Arrays.fill(vetor, 11); //todas pos. preenchidas com valor 11

        for(int x : vetor){
            System.out.println(x);
        }
    }
}
