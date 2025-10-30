import utils.GravarLog;

import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, r;
        while (true) {
            try {
                System.out.println("Digite o primeiro valor: ");
                a = Integer.parseInt(ler.nextLine());
                System.out.println("Digite o segundo valor: ");
                b = Integer.parseInt(ler.nextLine());
                r = a / b;
                System.out.println("Resultado: " + r);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido para a entrada");
            } catch (ArithmeticException e) {
                System.out.println("Impossivel dividir por ZERO");
            } catch (Exception e){
                System.out.println("Ocorreu um erro");
                System.out.println("Erro: " + e.getMessage());
                GravarLog.registrar_log(e);
            }finally {
                System.out.println("Executei independente de erro");
            }
        }


    }
}
