package view;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class GerenciarLogin {
    public static List<Logavel> logados = new ArrayList<>();

    public static void main(String[] args) {
        GerenciarLogin gerenciar = new GerenciarLogin();
        //Fazer os teste....
        Fornecedor fornecedor = new Fornecedor();
        Gerente gerente = new Gerente();
        Secretaria secretaria1 = new Secretaria();
        Secretaria secretaria2 = new Secretaria();
        Cliente cliente = new Cliente();
        Operador operador = new Operador();
        //OPERADOR E FORNECEDOR não conseguem efetuar login
        //operador.login(); Não é possível
        //fornecedor.login(); Não é possível
        gerente.login();
        secretaria1.login();
        secretaria2.login();
        cliente.login();
        //mostrando os logados
        gerenciar.exibirLogados();
        secretaria1.logout();
        System.out.println();
        gerenciar.exibirLogados();
    }

    public void exibirLogados(){
        System.out.println("Logados no momento: " + logados.size());
        for(Logavel o : logados){
            System.out.println(o);
        }
    }
}