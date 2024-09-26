package model;

public abstract class Conta {
    private int numero;
    private String nomeCliente;
    private String nomeAgencia;
    private double saldo;

    //construtor
    public Conta(int numero, String nomeCliente, String nomeAgencia) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.nomeAgencia = nomeAgencia;
        this.saldo = 0; //saldo zerado
    }

    //gets sets
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
