package root;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class GerenciarAcesso {

    //Lista reflete quem está logado no momento
    public static List<Logavel> logados = new ArrayList<>();

    public static void main(String[] args) {
        GerenciarAcesso gerenciar = new GerenciarAcesso();
        //A ideia é criar um objeto de cada tipo
        Cliente cliente = new Cliente();
        Gerente gerente = new Gerente();
        Secretaria secretaria = new Secretaria();
        Operador operador = new Operador();
        Fornecedor fornecedor = new Fornecedor();
        //Quem loga e quem nao loga
        secretaria.efetuarLogin();
        gerente.efetuarLogin();
        fornecedor.efetuarLogin();
        //veja que nao consigo acesso aos métodos de quem nao implemente
        //operador.efetuarLogin(); //gera erro
        fornecedor.efetuarLogoff();
        gerenciar.exibirLogados();
    }

    public void exibirLogados(){
        System.out.println("Total de Logados no momento: " + logados.size());
        System.out.println("Logados:");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for(Logavel logado: logados){
            System.out.println(logado);
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
