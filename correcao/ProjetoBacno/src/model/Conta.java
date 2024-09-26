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

    public void depositar(double valor) {
        this.saldo += valor; //acrescimo ao saldo
    }

    public void sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            cobrarTarifa();
        }else{
            throw new IllegalArgumentException("Sem saldo para saque");
        }
    }

    @Override
    public String toString() {
        return "Dados da conta: \n" +
                "Num: " + numero + "\n" +
                "Cliente: " + nomeCliente + "\n" +
                "Agencia: " + nomeAgencia + "\n" +
                "Saldo da Conta: " + saldo + "\n";
    }

    //método abstrato para cobrarTarifa por transacao
    abstract  void cobrarTarifa();
}
