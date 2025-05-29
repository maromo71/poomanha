package model;

import root.GerenciarAcesso;

public class Fornecedor implements Logavel{
    @Override
    public void efetuarLogin() {
        System.out.println("Fornecedor efetuou login: " + this);
        GerenciarAcesso.logados.add(this);
    }

    @Override
    public void efetuarLogoff() {
        System.out.println("Fornecedor efetuou logoff: " + this);
        GerenciarAcesso.logados.remove(this);
    }
}
