package model;

import root.GerenciarAcesso;

public class Gerente extends Funcionario implements Logavel{

    @Override
    public void efetuarLogin() {
        System.out.println("Gerente efetuou login: " + this);
        GerenciarAcesso.logados.add(this);
    }

    @Override
    public void efetuarLogoff() {
        System.out.println("Gerente efetuou logoff: " + this);
        GerenciarAcesso.logados.remove(this);
    }
}
