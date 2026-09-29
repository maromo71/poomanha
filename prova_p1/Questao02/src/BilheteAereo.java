public class BilheteAereo {
    // Atributos individuais de estado
    private String codigoLocalizador;
    private String nomePassageiro;
    private double valorBaseTarifa;

    // Atributos globais - estaticos da empresa
    private static double taxaEmbarque = 45.50;
    private static int contadorBilhetes = 0;

    // Construtor para inicializar os dados individuais e incrementar o contador global
    public BilheteAereo(String codigoLocalizador, String nomePassageiro, double valorBaseTarifa) {
        this.codigoLocalizador = codigoLocalizador;
        this.nomePassageiro = nomePassageiro;
        this.valorBaseTarifa = valorBaseTarifa;

        // Incrementa automaticamente o contador global a cada nova instância
        BilheteAereo.contadorBilhetes++;
    }

    // Método para calcular e retornar o valor total a ser pago
    public double calcularValorFinal() {
        return this.valorBaseTarifa + BilheteAereo.taxaEmbarque;
    }
}