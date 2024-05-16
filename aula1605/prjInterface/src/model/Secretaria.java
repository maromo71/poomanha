package model;

import view.GerenciarLogin;

import java.time.LocalDateTime;

public class Secretaria extends Empregado implements Logavel{

    @Override
    public void login() {
        System.out.println("Secretaria logou: " +
                LocalDateTime.now());
        GerenciarLogin.logados.add(this);
    }

    @Override
    public void logout() {
        System.out.println("Secretaria saiu do sistema: " +
                LocalDateTime.now());
        GerenciarLogin.logados.remove(this);
    }
}
