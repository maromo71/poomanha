package model;

import exception.CaixaException;

public class Caixa {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }
    //Lógica de negócios
    public void depositar(double valor) throws CaixaException {
        if(valor > 0){
            saldo += valor;
        }else{
            throw new CaixaException("RF01E02");
        }
    }

    public void sacar(double valor) throws CaixaException {
        if(valor <= saldo){
            saldo -= valor;
        }else{
            throw new CaixaException("RF01E01");
        }
    }

}
