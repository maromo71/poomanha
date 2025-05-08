package view;

import model.Conta;
import model.ContaCorrente;
import model.Poupanca;


import java.util.ArrayList;
import java.util.List;

public class GerenciarContas {
    private List<Conta> listaDeContas = new ArrayList<>();

    public static void main(String[] args) {
        Conta.GerenciarContas gc = new Conta.GerenciarContas();
        //Duas correntes novas + 1 poupanca
        ContaCorrente conta1 = new ContaCorrente(1, "Carlos", 1000.0);
        ContaCorrente conta2 = new ContaCorrente(2, "Maria", 1000.0);
        Poupanca conta3 = new Poupanca(3, "Ze", 0.013);
        //Depositar e sacar da conta1. (Dep 1000,00 Saq: 300)
        boolean ok = conta1.depositar(1000.0);
        if(ok){
            System.out.println("Dep ef com sucesso");
        }else{
            System.out.println("Valor invalido para dep");
        }
        ok = conta1.sacar(300.0);
        if(ok){
            System.out.println("Sq ef com sucesso");
        }else{
            System.out.println("Sem saldo suficente");
        }
        gc.listaDeContas.add(conta1);
        gc.listaDeContas.add(conta2);
        gc.listaDeContas.add(conta3);
        conta2.depositar(100);
        conta3.depositar(50);

        double total = 0;
        for(Conta conta : gc.listaDeContas){
            total += conta.getSaldo();
        }

        System.out.println("Total de todas as contas R$: " + total);
    }
}
