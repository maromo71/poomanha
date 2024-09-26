//2b

public class Aluno {
    private int ra;
    private String nome;
    private String login;
    private String senha;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Aluno(){

    }

    public Aluno(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    public Aluno(int ra, String nome, String login, String senha) {
        this(login, senha);
        this.ra = ra;
        this.nome = nome;
    }
}
