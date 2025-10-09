package model;

public class Corrente extends Conta {
    private double limite;

    public Corrente(int numero, String cliente, double limite) {
        super(numero, cliente);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= (saldo + limite)){
            saldo-= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Limite de Cheque: " + limite + "\n";
    }
}
