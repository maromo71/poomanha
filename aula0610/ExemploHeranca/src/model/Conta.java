package model;

import java.time.LocalDate;

public abstract class Conta {
    protected int numero;
    protected String nomeCliente;
    protected LocalDate dataAbertura;
    protected double saldo;

    //metodo contrutor
    public Conta(int numero, String nomeCliente){
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.dataAbertura = LocalDate.now();
        this.saldo = 0.00;
    }

    public boolean sacar(double valor){
        if(valor<=saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dados da conta \n" +
                "Conta: " + numero + "\n" +
                "Cliente: " + nomeCliente + "\n" +
                "Abertura: " + dataAbertura + "\n" +
                "Saldo: " + saldo + "\n";
    }


}
