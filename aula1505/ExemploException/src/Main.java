import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            int a, b, resultado;
            System.out.println("Digite um valor: ");
            a = Integer.parseInt(scanner.nextLine());
            System.out.println("Digite um valor: ");
            b = Integer.parseInt(scanner.nextLine());
            resultado = a / b;
            System.out.println("Resultado: " + resultado);
        }catch (NumberFormatException e){
            System.out.println("Erro: valor deve ser inteiro");
        }catch (ArithmeticException e){
            System.out.println("Impossível dividor por ZERO");
        }catch(Exception e){
            System.out.println("Erro inesperado");
            System.out.println("Descrição do Erro: " + e.getMessage());
        }finally {
            //normalmente , fechamento de arquivos, banco, etc.
            System.out.println("Fim do programa");
        }

    }
}