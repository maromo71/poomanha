package model;

public class Poupanca extends Conta{
    private double taxaRendimento;


    public Poupanca(int numero, String nomeCliente,double taxaRendimento ) {
        super(numero, nomeCliente);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Taxa de Rendimento: " + taxaRendimento + "\n";
    }
}
