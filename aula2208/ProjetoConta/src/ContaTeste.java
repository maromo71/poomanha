import model.Conta;

import java.util.Scanner;

public class ContaTeste {
    public Conta cc = null;
    Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        ContaTeste teste = new ContaTeste();
        int opc = 0;
        do {
            System.out.println("Menu Banco");
            System.out.println("1.. Cadastrar Conta");
            System.out.println("2.. Depositar Valor");
            System.out.println("3.. Consultar Saldo da Conta");
            System.out.println("4.. Sacar Valor");
            System.out.println("9.. Sair");
            System.out.println("Escolha sua opção: ");
            opc = Integer.parseInt(teste.leitor.nextLine());
            switch (opc) {
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execDepositar();
                    break;
                case 3:
                    teste.execConsultar();
                    break;
                case 4:
                    teste.execSacar();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opc != 9);
    }

    public void execCadastrar(){
        if(cc==null){
            System.out.println("Cadastrando nova conta..");
            cc = new Conta();
            System.out.println("Digite o numero da conta: ");
            cc.conta = leitor.nextLine();
            System.out.println("Digite o nome do cliente: ");
            cc.nomeCliente = leitor.nextLine();
            System.out.println("Digite o nome da agência: ");
            cc.agencia = leitor.nextLine();
            System.out.println("Conta cadastrada com sucesso!");
        }else{
            System.out.println("A conta já foi cadastrada.");
        }

    }
    public void execConsultar(){
        cc.imprimir();
    }
    public void execSacar(){
        double valor;
        System.out.println("Digite o valor do saque: ");
        valor = Double.parseDouble(leitor.nextLine());
        if(cc.sacar(valor)){
            System.out.println("Saque efetuado com sucesso!");
        }else{
            System.out.println("Sem saldo suficiente!");
        }
    }
    public void execDepositar(){
        double valor;
        System.out.println("Digite o valor do deposito: ");
        valor = Double.parseDouble(leitor.nextLine());
        cc.depositar(valor);
        System.out.println("Depositado com sucesso!");
    }
}

