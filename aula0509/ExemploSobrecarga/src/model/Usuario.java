package model;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String cargo;
    private String nivel;

    //Método construtor
    public Usuario(int id, String senha){
        this.id = id;
        this.senha = senha;
        //entra em um metodo auxiliar para autentica
        boolean acesso = autenticar();
        if(acesso){
            System.out.println("Acesso garantido");
        }else{
            throw new IllegalArgumentException("Sem permissao de acesso");
        }
    }

    private boolean autenticar() {
        return false;
    }

    public Usuario(int id, String nome, String email, String senha, String cargo, String nivel){
        this(id, senha);
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.nivel = nivel;
    }

    public Usuario(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Dados do Usuário: \n" +
                "Id: " + id + "\n" +
                "Nome: " + nome + "\n";
    }
}
