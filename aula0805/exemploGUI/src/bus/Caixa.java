package bus;

public class Caixa {
    private double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
