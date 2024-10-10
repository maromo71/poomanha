package model;

public class Caixa {
    private double saldo;

    //métodos para depositar e sacar
    public boolean depositar(double valor) {
        if(valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }
    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
