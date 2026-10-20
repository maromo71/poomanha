import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int a, b, result;
            System.out.println("Digite o primeiro valor: ");
            a = Integer.parseInt(sc.nextLine());
            System.out.println("Digite o segundo valor: ");
            b = Integer.parseInt(sc.nextLine());
            result = a / b;
            System.out.println("Resultado: " + result);
        }catch (NumberFormatException ex){
            System.out.println("Verifique o valor digitado. Deve ser inteiro");
        }catch(ArithmeticException ex){
            System.out.println("Nao pode dividir numero inteiro por zero");
        }catch(Exception ex){
            System.out.println("Aconteceu um erro inexperado.");
            System.out.println("Mensagem do erro: " + ex.getMessage());
        }

    }
}
