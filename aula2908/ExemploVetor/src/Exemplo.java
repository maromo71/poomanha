import java.util.Arrays;

public class Exemplo {
    public static void main(String[] args) {
        //vetor para 10 inteiros
        int[] v = {55, 11, 9, 1000, 10, 89, 111, 1};
        Arrays.sort(v, 0, 3);
        for (int i = 0; i < v.length; i++) {
            System.out.printf("[%2d]  ", v[i]);
        }
        System.out.println();

    }
}
