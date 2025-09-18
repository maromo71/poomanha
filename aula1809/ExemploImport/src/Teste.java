import java.util.Scanner;


public class Teste {
    //V = (4/3) * π * r³,
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        System.out.println("Informe o raio da circunferencia:");
        r =  Integer.parseInt(input.nextLine());
        double v = (4 / 3.0) * Math.PI * Math.pow(r, 3);
        System.out.println("Area da circunferencia: " + v);
    }
}
