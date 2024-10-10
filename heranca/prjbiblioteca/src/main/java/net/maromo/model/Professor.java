package net.maromo.model;

public class Professor extends Usuario {
    private String departamento;
    private String titulacao;
    
    public Professor(int idUsuario, String nome, String email, String departamento, String titulacao) {
        super(idUsuario, nome, email);
        this.departamento = departamento;
        this.titulacao = titulacao;
    }
    
    public String getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public String getTitulacao() {
        return this.titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Dados do Professor \n" +
                super.toString() +
                "Departamento=" + departamento + '\n' +
                "Titulacao=" + titulacao + '\n';
    }
}
