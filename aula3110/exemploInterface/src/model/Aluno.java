package model;

import utils.GerenciarAcesso;

public class Aluno implements Logavel{
    private int matricula;
    private String nomeAluno;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    @Override
    public boolean login() {
        System.out.println("Aluno Logado: " + nomeAluno);
        //checar as credenciar no banco

        GerenciarAcesso.adicionarLogavel(this);
        return true;
    }

    @Override
    public boolean logout() {
        System.out.println("Aluno  " + nomeAluno + " Saiu do sistema");
        GerenciarAcesso.removerLogavel(this);
        return true;
    }
}
