package net.maromo;

import net.maromo.model.Aluno;
import net.maromo.model.ControleEmprestimo;
import net.maromo.model.Funcionario;
import net.maromo.model.Livro;
import net.maromo.model.Professor;

public class GerenciarBiblioteca {
    public static void main(String[] args) {
        // instancie um Aluno, um Professor e um Funcionario e popule os dados.
        Aluno aluno = new Aluno(1, "Marcio", "m@marcio", "Engenharia", "123456");
        Professor professor = new Professor(2, "Joaquim", "j@joaquim", "Ciência da Computação", "Doutor");
        Funcionario funcionario = new Funcionario(3, "Joao", "j@joao", "Administração", "Assistente");
        
        // instancie tres ou quatro Livros e popule os dados.
        Livro livro1 = new Livro(1, "A Arte da Guerra", "George R. R. Martin");
        Livro livro2 = new Livro(2, "Harry Potter e a pedra filosofal", "J. K. Rowling");
        Livro livro3 = new Livro(3, "Harry Potter e o prisioneiro de Azkaban", "J. K. Rowling");
        Livro livro4 = new Livro(4, "Harry Potter e o calice de fogo", "J. K. Rowling");

        String resposta = ControleEmprestimo.registraEmprestimo(1, livro1, aluno);
        System.out.println(resposta + "\n");
        resposta = ControleEmprestimo.registraEmprestimo(2, livro2, professor);
        System.out.println(resposta + "\n");
        resposta = ControleEmprestimo.registraEmprestimo(3, livro3, funcionario);
        System.out.println(resposta + "\n");
        resposta = ControleEmprestimo.registraEmprestimo(4, livro4, funcionario);
        System.out.println(resposta + "\n");


        resposta = ControleEmprestimo.registraDevolucao(1, livro1, aluno);
        System.out.println(resposta + "\n");
        resposta = ControleEmprestimo.registraDevolucao(2, livro2, professor);
        System.out.println(resposta + "\n");
        resposta = ControleEmprestimo.registraDevolucao(3, livro3, funcionario);
        System.out.println(resposta + "\n");
        resposta = ControleEmprestimo.registraDevolucao(4, livro4, funcionario);
        System.out.println(resposta + "\n");
    }
}