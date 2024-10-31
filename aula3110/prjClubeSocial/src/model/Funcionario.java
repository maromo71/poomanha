package model;

import utils.GerenciarEntrada;

public class Funcionario implements AcessoClube{
    private int id;
    private String nomeFuncionario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    @Override
    public void entrar() {
        System.out.println("Funcionário " + getNomeFuncionario() +
                " adentrou ao clube");
        GerenciarEntrada.adicionarPessoaNoClube(this);

    }

    @Override
    public void sair() {
        System.out.println("Funcionário " + getNomeFuncionario() +
                " deixou as dependências do clube");
        GerenciarEntrada.removerPessoaDoClube(this);
    }
}
