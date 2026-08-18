public class Conta {
    public int numConta;
    public String nomeCliente;
    public double saldo;
    public static double cpmf = 0.0038;

    public void depositar(double valor){
        saldo += valor;
    }
    public void retirar(double valor){
        double imposto = valor * cpmf;
        saldo -= valor + imposto;
    }

    public void exibirSaldo(){
        System.out.println("Saldo da conta: " + numConta + " = " + saldo);
    }
}
