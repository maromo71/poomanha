package model;

public class Caixa {
    private double saldo;

    public boolean sacar(double valor){
        if(valor<= saldo){
            saldo-= valor;
            return true;
        }
        return false;
    }
    public boolean depositar(double valor){
        if(valor>0.0){
            saldo+=valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}
