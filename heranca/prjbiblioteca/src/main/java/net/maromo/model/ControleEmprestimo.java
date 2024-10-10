package net.maromo.model;

import java.time.LocalDate;

public class ControleEmprestimo {
    public static String registraEmprestimo(int idEmprestimo, Livro livro, Usuario usuario) {
        //verifica se o livro nao está disponível
        if(!livro.isDisponivel()) return "Livro indisponivel!";

        //registra o emprestimo
        RegistroEmprestimo emprestimo = new RegistroEmprestimo(idEmprestimo, usuario, livro, LocalDate.now(), null);

        //atualiza o livro como indisponivel
        livro.setDisponivel(false);
        //Dados do Emprestimo.
        StringBuilder sb = new StringBuilder();
        sb.append("Livro emprestado: " + emprestimo.getLivro().getTitulo() + "\n");
        sb.append("Data do emprestimo: " + emprestimo.getDataEmprestimo() + "\n");
        sb.append("Retirado pelo usuário: " + emprestimo.getUsuario().getNome() + "\n");
        return "Emprestimo efetuado com sucesso! Dados: \n" + sb.toString();
    } 
    
    public static String registraDevolucao(int idEmprestimo, Livro livro, Usuario usuario) {
        //busca o emprestimo
        RegistroEmprestimo devolucao = new RegistroEmprestimo(idEmprestimo, usuario, livro, null, LocalDate.now());
        //atualiza o livro como disponível
        livro.setDisponivel(true);
        StringBuilder sb = new StringBuilder();
        sb.append("Livro devolvido: " + devolucao.getLivro().getTitulo() + "\n");
        sb.append("Data do devolucao: " + devolucao.getDataDevolucao() + "\n");
        sb.append("Retirado pelo usuário: " + devolucao.getUsuario().getNome() + "\n");
        return "Devolucao efetuada com sucesso! Dados: \n" + sb.toString();
    }
        
}
