public class ContaTeste {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.numConta = 121;
        conta1.nomeCliente = "Marcos Moraes";
        Conta.cpmf = 0.0010;
        conta1.depositar(3000);
        conta1.retirar(300);
        conta1.exibirSaldo();

        Conta conta2 = new Conta();
        conta2.numConta = 232;
        conta2.nomeCliente = "Ricardo Santos";
        conta2.depositar(1500.00);
        conta2.retirar(100);
        conta2.exibirSaldo();

    }
}
