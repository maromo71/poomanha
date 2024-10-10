package net.maromo.model;

public class Funcionario extends Usuario{
    private String setor;
    private String cargo;

    public Funcionario(int idUsuario, String nome, String email, String setor, String cargo) {
        super(idUsuario, nome, email);
        this.setor = setor;
        this.cargo = cargo;
    }


    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Dados do Funcionario \n" +
                super.toString() +
                "Setor=" + setor + '\n' +
                "Cargo='" + cargo + '\n';
    }

}
