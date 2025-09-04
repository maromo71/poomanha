import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ContaTeste gerenciar = new ContaTeste();
        int opcao = 0;
        do{
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar");
            System.out.println("9. Sair");
            System.out.println("Escolha sua opcao: ");
            opcao = Integer.parseInt(ler.nextLine());
            switch (opcao) {
                case 1 -> gerenciar.execCadastrar();
                case 2 -> gerenciar.execDepositar();
                case 3 -> gerenciar.execSacar();
                case 4 -> gerenciar.execConsultar();
                case 9 -> System.out.println("Fim do Programa");
                default -> System.out.println("Opcao invalida");
            }
        }while(opcao!=9);
    }
    public void execCadastrar(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        cc.conta = ler.nextLine();
        System.out.println("Digite a agencia da conta: ");
        cc.agencia = ler.nextLine();
        System.out.println("Digite o nome do cliente: ");
        cc.nomeCliente = ler.nextLine();
        System.out.println("Cadastro dos dados feito com sucesso!");
    }
    public void execConsultar(){
        cc.imprimir();
    }
    public void execSacar(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(ler.nextLine());
        if(cc.sacar(valor)){
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente na conta!");
        }
    }
    public void execDepositar(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(ler.nextLine());
        cc.depositar(valor);
        System.out.println("Deposito realizado com sucesso!");
    }
}
