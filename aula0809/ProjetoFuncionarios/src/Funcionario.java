public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String rg;
    private boolean naEmpresa;

    // gets sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isNaEmpresa() {
        return naEmpresa;
    }

    public void setNaEmpresa(boolean naEmpresa) {
        this.naEmpresa = naEmpresa;
    }

    public void bonificar(double aumento){
        salario += aumento;
    }
    public void imprimir(){
        System.out.println("Dados do Funcionario");
        System.out.println("nome = " + nome);
        System.out.println("departamento = " + departamento);
        System.out.println("salario = " + salario);
        System.out.println("rg = " + rg);
        if(naEmpresa){
            System.out.println("funcionario ativo na empresa");
        }else{
            System.out.println("funcionario desligado da empresa");
        }
    }
}
