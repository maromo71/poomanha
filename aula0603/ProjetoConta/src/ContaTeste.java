import java.util.Scanner;

public class ContaTeste {
    Conta cc = new Conta();

    public static void main(String[] args) {
        ContaTeste teste = new ContaTeste();
        Scanner input = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Depositar na Conta");
            System.out.println("3. Sacar da Conta");
            System.out.println("4. Consultar Conta");
            System.out.println("9. Sair");
            System.out.println("Escolha opcao: ");
            opc = Integer.parseInt(input.nextLine());
            switch (opc) {
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execDepositar();
                    break;
                case 3:
                    teste.execSacar();
                    break;
                case 4:
                    teste.execConsultar();
                    break;
                case 9:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

        } while (opc != 9);
    }//

    public void execSacar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do saque:");
        double valor = Double.parseDouble(input.nextLine());
        if(cc.sacar(valor)){
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Sem saldo disponível");
        }
    }

    public void execDepositar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(input.nextLine());
        cc.depositar(valor);
        System.out.println("Depositado com sucesso!");
    }

    public void execConsultar() {
        cc.imprimir();
    }

    public void execCadastrar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero do conta: ");
        cc.setConta(input.nextLine());
        System.out.println("Digite a agencia do conta: ");
        cc.setAgencia(input.nextLine());
        System.out.println("Digite o nome do cliente: ");
        cc.setNomeCliente(input.nextLine());
        System.out.println("Cadastro efetuado com sucesso!");
    }
}