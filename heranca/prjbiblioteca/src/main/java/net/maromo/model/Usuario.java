package net.maromo.model;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String email;

    public Usuario(int idUsuario, String nome, String email) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Dados do Usuário \n" +
                "IdUsuario=" + idUsuario + "\n" +
                "Nome='" + nome + '\n' +
                "Email='" + email + '\n';
    }
}
