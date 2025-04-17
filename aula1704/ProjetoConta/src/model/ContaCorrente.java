package model;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numConta, String nomeCliente, double limite) {
        super(numConta, nomeCliente);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= (limite +getSaldo())){
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    @Override
    public void cobrarTaxaManutencao() {
        System.out.println("Taxa Conta Corrente R$ 22,00");
    }

    @Override
    public String toString() {
        String texto = super.toString();
        texto += "Limite do especial: " + limite;
        return texto;
    }
}
