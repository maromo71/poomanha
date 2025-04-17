package model;

public class Poupanca extends Conta{
    private double taxaJuros;

    public Poupanca(int numConta, String nomeCliente, double taxaJuros) {
        super(numConta, nomeCliente);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void cobrarTaxaManutencao() {
        System.out.println("Taxa Manutenção Poupança R$ 0,00");
    }

    @Override
    public String toString() {
        String texto = super.toString();
        texto += "Taxa de Juros: " + taxaJuros;
        return texto;
    }
}
