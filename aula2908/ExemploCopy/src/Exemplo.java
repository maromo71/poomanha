public class Exemplo {
    public static void main(String[] args) {
        int[] v1 = { 1, 2, 3, 4, 5, 6, 7 , 8};

        int[] v2 = new int[8];
        System.arraycopy(v1, 0, v2, 5, 3);

        for (int i = 0; i < v2.length; i++) {
            System.out.println(v2[i]);
        }
    }
}
