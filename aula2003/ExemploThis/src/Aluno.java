public class Aluno {
    public int ra;
    public String nome;
    public String email;
    public String login;
    public String senha;

    public Aluno(){

    }
    public Aluno(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    public Aluno(int ra, String nome, String email, String login, String senha){
        this(login,senha);
        this.ra = ra;
        this.nome = nome;
        this.email = email;

    }

    public void imprimir(){
        System.out.println("RA: " + this.ra );
        System.out.println("NOME: " + this.nome );
        System.out.println("EMAIL: " + this.email );
        System.out.println("LOGIN: " + this.login );
    }
}
