public class CartaoCorporativo {
    private String titular;
    private double saldoDisponivel;
    private double limiteTotal;

    public CartaoCorporativo(String titular, double limiteTotal) {
        this.titular = titular;
        this.limiteTotal = limiteTotal;
        this.saldoDisponivel = limiteTotal;
    }

    public boolean autorizarCompra(double valor) {
        if (valor > 0 && valor <= this.saldoDisponivel) {
            this.saldoDisponivel -= valor;
            return true;
        }
        return false;
    }

    public double getSaldoDisponivel() {
        return this.saldoDisponivel;
    }
}