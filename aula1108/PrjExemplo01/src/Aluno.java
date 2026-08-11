public class Aluno {
    //1. Definir os atributos
    private int ra;
    private String nome;
    private String email;
    private String turma;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //2. Definir os métodos
    public void matricular(){
        System.out.println("Aluno de RA: " + ra);
        System.out.println("Foi matriculado com sucesso");
        System.out.println("Bem vindo " + nome);
    }

    public void cancelarMatricula(){
        System.out.println("Aluno " + nome + " teve matricula cancelada");
    }
    public void setTurma(String turma){
        this.turma = turma;
    }
    public String getTurma(){
        return turma;
    }
}
