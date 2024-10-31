package model;

import utils.GerenciarEntrada;

public class Socio implements AcessoClube{
    private int id;
    private String nomeSocio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeSocio() {
        return nomeSocio;
    }

    public void setNomeSocio(String nomeSocio) {
        this.nomeSocio = nomeSocio;
    }

    @Override
    public void entrar() {
        System.out.println("Sócio " + getNomeSocio() +
                " adentrou ao clube");
        GerenciarEntrada.adicionarPessoaNoClube(this);
    }

    @Override
    public void sair() {
        System.out.println("Sócio " + getNomeSocio() +
                " retirou-se das dependências do clube");
        GerenciarEntrada.removerPessoaDoClube(this);
    }
}
