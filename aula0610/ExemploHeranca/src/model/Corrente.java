package model;

public class Corrente extends Conta{
    private double limite;


    public Corrente(int numero, String nomeCliente, double limite) {
        super(numero, nomeCliente);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= (saldo + limite)){
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Limite: " + limite + "\n";
    }
}
