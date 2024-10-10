package net.maromo.model;

import java.time.LocalDate;

public class RegistroEmprestimo {
    private int idEmprestimo;
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public RegistroEmprestimo(int idEmprestimo, Usuario usuario, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.idEmprestimo = idEmprestimo;
        this.usuario = usuario;
        this.livro = livro;
        if(this.dataEmprestimo == null){
            this.dataEmprestimo = dataEmprestimo;
        }
        if(dataDevolucao != null){
            this.dataDevolucao = dataDevolucao;
        }
    }


    public int getIdEmprestimo() {
        return this.idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return this.livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    

}
