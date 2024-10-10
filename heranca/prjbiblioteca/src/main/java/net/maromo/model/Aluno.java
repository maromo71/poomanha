package net.maromo.model;

public class Aluno extends Usuario {
    private String curso;
    private String matricula;
    
    
    public Aluno(int idUsuario, String nome, String email, String curso, String matricula) {
        super(idUsuario, nome, email);
        this.curso = curso;
        this.matricula = matricula;
    } 

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    

    @Override
    public String toString() {
        return "Dados do Aluno \n" +
            super.toString() +
            "Curso='" + curso + '\n' +
            "Matricula='" + matricula + '\n';
    }

    
}
