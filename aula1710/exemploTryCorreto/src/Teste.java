import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0, b=0, c=0;

        try{
            System.out.println("Digite valor para a:");
            a = sc.nextInt();
            System.out.println("Digite valor para b:");
            b = sc.nextInt();
            c = a / b;
            System.out.println("Dividir: "+ c);
        }catch (InputMismatchException e){
            System.out.println("Valores devem ser inteiros");
        }catch(ArithmeticException e){
            System.out.println("Erro: Dividir inteiro por zero");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
