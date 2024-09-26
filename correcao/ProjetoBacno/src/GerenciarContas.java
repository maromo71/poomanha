import model.Conta;
import model.Corrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;

public class GerenciarContas {
    private List<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {
        //Criar uma conta-corrente e criar uma conta poupanca
        Corrente conta1 = new Corrente(11, "Maromo",
                "Mogi Mirim", 1300);
        Poupanca conta2 = new Poupanca(12, "Maromo",
                "Mogi Mirim", 26);
        //depositar na conta1 - 1000
        conta1.depositar(1000);
        //depositar na conta2 - 2000
        conta2.depositar(2000);

        //sacar 2200 da conta1
        conta1.sacar(2200);

        //sacar 1000 da conta 2
        conta2.sacar(1000);


        GerenciarContas gc =new GerenciarContas();
        gc.adicionarConta(conta1);
        gc.adicionarConta(conta2);
        gc.listarContas();

    }

    public void adicionarConta(Conta conta) {
        contas.add(conta); //adicionar uma conta na lista
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }
}
