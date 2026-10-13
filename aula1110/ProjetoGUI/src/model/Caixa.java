package model;

public class Caixa {
    private double saldo;

    public boolean depositar(double valor){
        if(valor <= 0){
            return false;
        }
        saldo += valor;
        return true;
    }

    public boolean sacar(double valor){
        if(valor > saldo){
            return false;
        }
        saldo -= valor;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }
}
