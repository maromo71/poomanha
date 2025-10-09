package model;

public class Poupanca extends Conta{
    private double taxaJuros;

    public Poupanca(int numero, String cliente, double taxaJuros) {
        super(numero, cliente);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Taxa de Juros: " + taxaJuros + "\n";
    }
}
