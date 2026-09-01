import java.util.Scanner;

public class ContaTeste {
    //Atributo public fora do main, para operacoes com caixa
    public Conta cc = new Conta();

    public static void main(String[] args) {
        //Criar um objeto do tipo ContaTeste
        ContaTeste gerenciar = new ContaTeste();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("Menu de Operacoes com Caixa");
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Depositar na Conta");
            System.out.println("3. Sacar da Conta");
            System.out.println("4. Exibir dados da Conta");
            System.out.println("9. Sair");
            System.out.println("Digite sua opcao: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1-> gerenciar.execCadastrar();
                case 2-> gerenciar.execDepositar();
                case 3-> gerenciar.execSacar();
                case 4-> gerenciar.execConsultar();
                case 9-> System.out.println("Fim do programa");
                default -> System.out.println("Opcao invalida");
            }
        }while(opcao != 9);
    }

    public void execCadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        cc.setConta(sc.nextLine());
        System.out.println("Digite o nome da agencia: ");
        cc.setAgencia(sc.nextLine());
        System.out.println("Digite o nome do cliente.");
        cc.setNomeCliente(sc.nextLine());
        System.out.println("Cadastro efetuado com sucesso");
    }

    public void execConsultar() {
        cc.imprimir();
    }

    public void execSacar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(sc.nextLine());
        if(cc.sacar(valor)){
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Sem saldo para o saque");
        }
    }
    public void execDepositar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(sc.nextLine());
        if(cc.depositar(valor)) {
            System.out.println("Deposito efetuado com sucesso...");
        }else{
            System.out.println("Valor invalido para deposito...");
        }
    }
}
