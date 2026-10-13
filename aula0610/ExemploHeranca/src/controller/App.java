package controller;

import model.Conta;
import model.Corrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    List<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {
        App aplicativo = new App();
        int opcao = 0;
        do{
            opcao = aplicativo.execMenu();
            switch (opcao){
                case 1-> aplicativo.execCadastar();
                case 2-> aplicativo.execDepositar();
                case 3 -> aplicativo.execSacar();
                case 4-> aplicativo.execEmitirSaldo();
                case 5 -> {
                    System.out.println("Total depositado: ");
                    System.out.println("R$ " + aplicativo.execMontante());
                }
                case 9 -> System.out.println("Fim da Aplicativo");
            }
        }while(opcao!=9);

    }


    public void execCadastar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipo de conta: ");
        System.out.println("1. para Conta Corrente");
        System.out.println("2. para Conta Poupança");
        System.out.println("Escolha o tipo: ");
        int tipo = Integer.parseInt(sc.nextLine());
        Conta conta = null;
        //atributos comuns
        System.out.println("Digite o numero da conta: ");
        int numConta = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        if(tipo == 1){
            //atributo especialista de conta corrente
            System.out.println("Digite o limite da conta: ");
            double limite = Double.parseDouble(sc.nextLine());
            conta = new Corrente(numConta, nomeCliente, limite);
        }else if(tipo == 2){
            //atritubo especialista de poupanca
            System.out.println("Digite a taxa de rendimento: ");
            double taxaRendimento = Double.parseDouble(sc.nextLine());
            conta = new Poupanca(numConta, nomeCliente, taxaRendimento);
        }else{
            System.out.println("Tipo invalido");
            System.out.println("Repita a operacao");
            return;
        }
        //adicionamos a conta na lista
        contas.add(conta);
        System.out.println("Conta cadastra com sucesso");
    }
    public void execDepositar(){
        Conta conta = encontrarConta();
        if(conta==null){
            System.out.println("Conta nao encontrada");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(sc.nextLine());
        if(conta.depositar(valor)){
            System.out.println("Deposito efetuado com sucesso");
        }else{
            System.out.println("Valor invalido para o deposito");
        }
    }
    public void execSacar(){
        Conta conta = encontrarConta();
        if(conta==null){
            System.out.println("Conta nao encontrada");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(sc.nextLine());
        if(conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo ou limite para a operacao");
        }
    }

    public void execEmitirSaldo(){
        Conta conta = encontrarConta();
        if(conta==null){
            System.out.println("Conta nao encontrada");
            return;
        }
        //chamando o toString da conta implicitamente
        System.out.println(conta);
    }

    public double execMontante(){
        double total = 0.0;
        for(Conta c : contas){
            total += c.getSaldo();
        }
        return total;
    }

    public int execMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu da aplicação");
        System.out.println("1. Cadastrar Conta");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Emitir Saldo");
        System.out.println("5. Exibir Montante");
        System.out.println("9. SAIR");
        System.out.println("Escolha sua opcao: ");
        return Integer.parseInt(sc.nextLine());
    }

    private Conta encontrarConta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta desejada: ");
        int numero = Integer.parseInt(sc.nextLine());
        //varrer a lista de contas, procurando uma que tenha o mesmo
        for(Conta c : contas){
            if(c.getNumero() == numero){
                return c;
            }
        }
        return null;
    }
}
