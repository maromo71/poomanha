import exception.CaixaException;
import model.Caixa;

import java.util.Scanner;

public class GerenciarConta {
    private Caixa caixa = new Caixa(); //Controlar apenas um caixa

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarConta gerenciar = new GerenciarConta();
        int opc = 0;
        do{
            try {
                System.out.println("Escolha sua opção: ");
                System.out.println("1. Depositar ");
                System.out.println("2. Sacar ");
                System.out.println("3. Exibir Saldo ");
                System.out.println("9. Finalizar ");
                System.out.println("Digite pelo numero:  ");
                opc = Integer.parseInt(sc.nextLine());
                switch (opc) {
                    case 1:
                        gerenciar.execDepositar(sc);
                        break;
                    case 2:
                        gerenciar.execSacar(sc);
                        break;
                    case 3:
                        gerenciar.execSaldo();
                        break;
                    case 9:
                        System.out.println("Fim do programa");
                        break;
                    default:
                        System.out.println("opção inválida");
                }
            }catch(NumberFormatException e){
                System.out.println("Erro: Valor deve ser numerico");
            }catch (Exception e){
                System.out.println("Erro: " + e.getMessage());
            }

        }while(opc != 9);
    }

    public void execDepositar(Scanner sc) throws CaixaException {
        System.out.println("Digite o valor do depósito: ");
        double valor = Double.parseDouble(sc.nextLine());
        caixa.depositar(valor);
        System.out.println("Depósito efetuado com sucesso");
    }

    public void execSacar(Scanner sc) throws CaixaException {
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(sc.nextLine());
        caixa.sacar(valor);
        System.out.println("Saque efetuado com sucesso");
    }

    public void execSaldo(){
        System.out.println("Saldo atual: " + caixa.getSaldo());
    }
}
