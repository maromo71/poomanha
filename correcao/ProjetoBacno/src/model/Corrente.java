package model;

public class Corrente extends Conta{
    //atributo
    private double limite;

    public Corrente(int numero, String nomeCliente, String nomeAgencia, double limite) {
        super(numero, nomeCliente, nomeAgencia);
        this.limite = limite;
    }

    //gets and sets
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
