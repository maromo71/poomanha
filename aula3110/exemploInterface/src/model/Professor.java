package model;

import utils.GerenciarAcesso;

public class Professor extends Funcionario implements Logavel {
    //atributos especificos (poderia definir)

    @Override
    public boolean login() {
        System.out.println("Professor logou: " + getNomeFunc());
        GerenciarAcesso.adicionarLogavel(this);
        return true;
    }

    @Override
    public boolean logout() {
        System.out.println("Professor saiu do sistema: " +getNomeFunc());
        GerenciarAcesso.removerLogavel(this);
        return true;
    }



}
