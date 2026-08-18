public class ApoliceTeste {

    public static void main(String[] args) {
        //Objeto apolice do tipo Apolice (classe)
        Apolice apolice = new Apolice();
        apolice.setNomeSegurado("Igor Magalhães");
        apolice.setIdade(21);
        apolice.setValorPremio(100000.0);
        apolice.imprimir();
    }
}
