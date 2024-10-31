package utils;

import model.AcessoClube;
import model.Funcionario;
import model.Socio;

import java.util.ArrayList;
import java.util.List;

public class GerenciarEntrada {

    private static List<AcessoClube> pessoasNoClube = new ArrayList<>();

    public static List<AcessoClube> getPessoaNoClube() {
        return pessoasNoClube;
    }

    public static void adicionarPessoaNoClube(AcessoClube pessoa) {
        pessoasNoClube.add(pessoa);
    }

    public static void removerPessoaDoClube(AcessoClube pessoa) {
        pessoasNoClube.remove(pessoa);
    }

    public static void listarPessoasNoClube() {
        System.out.println("\nPessoas nas dependências do clube no momento: ");
        for (AcessoClube pessoa : pessoasNoClube) {
            if(pessoa instanceof Funcionario){
                Funcionario f = (Funcionario) pessoa;
                System.out.println("Funcionário: " + f.getNomeFuncionario());
            }else{
                Socio s = (Socio) pessoa;
                System.out.println("Sócio: " + s.getNomeSocio());
            }
        }
    }
}
