package controller;

import model.Conta;
import model.Corrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;

public class App {
    List<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {
        Corrente conta1 = new Corrente(111, "Maromo", 1000) ;
        conta1.depositar(1000.0);
        if(conta1.sacar(1200)){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo para o saque");
        }
        System.out.println(conta1.toString());
        Poupanca conta2 = new Poupanca(222, "Chica", 0.89);
        conta2.depositar(1000);
        if(conta2.sacar(300)){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo na poupanca");
        }
        System.out.println(conta2);

    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }
}
