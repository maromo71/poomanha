package model;

import view.GerenciarLogin;

import java.time.LocalDateTime;

public class Gerente extends Empregado implements Logavel{

    @Override
    public void login() {
        System.out.println("Gerente logou: " +
                LocalDateTime.now());
        GerenciarLogin.logados.add(this);
    }

    @Override
    public void logout() {
        System.out.println("Gerente saiu do sistema: " +
                LocalDateTime.now());
        GerenciarLogin.logados.remove(this);
    }
}
