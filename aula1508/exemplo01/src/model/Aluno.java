package model;

public class Aluno {
    //Atributos
    public int ra;
    public String nome;
    public String telefone;
    public String email;
    //atributo estático - compartilhado
    public static final String unidadeEscolar = "Fatec";

    //Métodos
    public void matricular(){
        System.out.println("Matricular Aluno");
        System.out.println("Ra: " + ra);
        System.out.println("Nome: " + nome);
        System.out.println("Unidade Escola: " + unidadeEscolar);
    }

}
