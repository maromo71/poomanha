import java.security.SecureRandom;
import java.util.Random;

public class Sena {
    private int[] nums = new int[6];

    public Sena(){
        //sorteio do valores
        sortear();
    }

    private void sortear() {
        SecureRandom sr = new SecureRandom();
        for (int i = 0; i < 6; i++) {
            nums[i] = sr.nextInt(1, 60);
        }
    }

    public void mostrar() {
        for (int i = 0; i < 6; i++) {
            System.out.println(nums[i]);
        }
    }
}
