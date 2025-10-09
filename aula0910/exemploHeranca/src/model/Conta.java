package model;

import java.time.LocalDate;

public abstract class Conta {
    private int numero;
    private String cliente;
    private LocalDate dataDeAbertura;
    protected double saldo;

    public Conta(int numero, String cliente){
        this.numero = numero;
        this.cliente = cliente;
        this.dataDeAbertura = LocalDate.now();
        this.saldo = 0;
    }
    public boolean depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            return true;
        }
        System.out.println("Valor invalido");
        return false;
    }
    public boolean sacar(double valor){
        if(valor <= saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dados da Conta n. " + numero + "\n" +
                "Nome Cliente: " + cliente + "\n" +
                "Data Abertura: " + dataDeAbertura + "\n" +
                "Saldo: " + saldo + "\n";
    }

    public double getSaldo() {
        return saldo;
    }
}
