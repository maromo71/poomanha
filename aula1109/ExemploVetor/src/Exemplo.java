import java.util.Arrays;
import java.util.Collections;

public class Exemplo {
    public static void main(String[] args) {
        int[] vetor = {5, 7, 1,3, 9, 12, 44, 33, 10};
        //Arrays.sort(vetor);
        int[] vetor2 = new int[5];
        Arrays.fill(vetor2, 17);
        System.arraycopy(vetor, 4, vetor2, 2, 3);

        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("pos: " + i + "= " + vetor2[i]);
        }
    }
}
