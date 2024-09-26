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

    @Override
    public void sacar(double valor) {
        if(valor <= (getSaldo() + limite)){
            setSaldo(getSaldo() - valor);
            cobrarTarifa();
        }else{
            throw new IllegalArgumentException("Sem saldo/limite");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Limite: " + limite;
    }

    @Override
    void cobrarTarifa() {
        setSaldo(getSaldo() - 1.0);
    }
}
