import java.util.Objects;

public class Aluno {
    private int matricula;
    private String nomeAluno;
    private String nomeCurso;

    public Aluno(int matricula, String nomeAluno, String nomeCurso) {
        this.matricula = matricula;
        this.nomeAluno = nomeAluno;
        this.nomeCurso = nomeCurso;
    }
    public Aluno(){

    }
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

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Aluno) obj).matricula == this.matricula;
    }

    @Override
    public int hashCode() {
        //logica para o hash
        //qtd de caracteres que o campo nomeAluno possui
        return nomeAluno.length();
    }
}
