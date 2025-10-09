import model.Conta;
import model.Corrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;

public class GerenciarConta {

    List<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {
        //Criar 4 contas novas. Sendo duas poupancas e duas correntes
        //Depositar e sacar de algumas delas
        //Incluir todas elas na lista de contas
        //Exibir o saldo total de todas as contas independente do seu tipo
        Corrente corrente1 = new Corrente(1, "Maria", 2000);
        Corrente corrente2 = new Corrente(2, "Joao", 3000);
        Poupanca poupanca1 = new Poupanca(1, "Joao", 0.03);
        Poupanca poupanca2 = new Poupanca(2, "Maria", 0.03);
        GerenciarConta gc = new GerenciarConta();
        gc.adicionarConta(corrente1);
        gc.adicionarConta(corrente2);
        gc.adicionarConta(poupanca1);
        gc.adicionarConta(poupanca2);
        corrente1.depositar(1000);
        corrente2.depositar(2000);
        poupanca1.depositar(5000);
        poupanca2.depositar(6000);
        System.out.println("Saldo de todas as contas: " + gc.getTotalPatrimonio());
    }
    //Metodo com argumento polimorfico
    public void adicionarConta(Conta conta){
        contas.add(conta);
        //adicionamos uma conta corrente ou poupanca
        //na lista de contas.
    }

    public double getTotalPatrimonio(){
        //Varrer a lista somando o saldo de todas as contas que
        //estao na lita.
        double total = 0;
        for(Conta conta : contas){
            total += conta.getSaldo();
        }
        return total;
    }
}
