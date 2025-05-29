package model;

import root.GerenciarAcesso;

public class Secretaria extends Funcionario implements Logavel{
    @Override
    public void efetuarLogin() {
        System.out.println("Secretaria efetuou login: " + this);
        GerenciarAcesso.logados.add(this);
    }

    @Override
    public void efetuarLogoff() {
        System.out.println("Secretaria efetuou logoff: " + this);
        GerenciarAcesso.logados.remove(this);
    }
}
