import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ContaTeste gerenciarConta = new ContaTeste();
        int opcao = 0;
        do{
            //Menu
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar");
            System.out.println("9. Sair");
            System.out.println("Digite sua opcao: ");
            opcao = Integer.parseInt(leitor.nextLine());
            switch (opcao) {
                case 1 -> gerenciarConta.execCadastrar();
                case 2 -> gerenciarConta.execDepositar();
                case 3 -> gerenciarConta.execSacar();
                case 4 -> gerenciarConta.execConsultar();
                case 9 -> System.out.println("Fim do programa");
                default -> System.out.println("Opcao invalida");
            }
        }while(opcao!=9);
    }
    public void execCadastrar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Cadastrando os dados da conta");
        System.out.println("Digite o numero da conta: ");
        cc.conta = leitor.nextLine();
        System.out.println("Digite o nome da agencia: ");
        cc.agencia = leitor.nextLine();
        System.out.println("Digite o nome do cliente: ");
        cc.nomeCliente = leitor.nextLine();
        System.out.println("Dados cadastrados com sucesso");
    }
    public void execConsultar(){
        cc.imprimir();
    }
    public void execSacar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valorSaque = Double.parseDouble(leitor.nextLine());
        if(cc.sacar(valorSaque)){
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Sem saldo suficiente para o saque");
        }
    }
    public void execDepositar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valorDeposito = Double.parseDouble(leitor.nextLine());
        cc.depositar(valorDeposito);
        System.out.println("Deposito realizado com sucesso");
    }
}
