import java.time.LocalDate;

public class Carro {
    private String modelo;
    private String placa;
    private LocalDate dataCadastro;
    private double valor;

    //gerar os gets e sets
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimir(){
        System.out.println("Modelo = " + modelo);
        System.out.println("Placa = " + placa);
        System.out.println("Data de Cadastro = " + dataCadastro);
        System.out.printf("Valor R$ %.2f \n", valor);
    }
}
