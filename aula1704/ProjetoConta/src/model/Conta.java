package model;

public abstract class Conta {
    private int numConta;
    private String nomeCliente;
    private double saldo;

    //Construtor
    public Conta(int numConta, String nomeCliente){
        this.numConta = numConta;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
    }
    public boolean depositar(double valor){
        if(valor>0) {
            saldo += valor;
            return true;
        }
        return false;

    }
    public boolean sacar(double valor){
        if(valor<= saldo){
            saldo -=valor;
            return true;
        }
        return false;
    }

    abstract void cobrarTaxaManutencao();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Dados da Conta: \n" +
                "Num. Conta: " + numConta + "\n" +
                "Cliente: " + nomeCliente + "\n" +
                "Saldo: " + saldo + "\n";
    }
}
