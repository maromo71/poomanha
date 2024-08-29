package model;

public class Carro {
    //Atributos privados
    private String marca;
    private String modelo;
    private String cor;
    private String placa;

    //gets sets
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //métodos construtores
    public Carro(String marca, String modelo, String cor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }
    public Carro() {

    }
    //ao invés do imprimir vamos usar o toString()

    @Override
    public String toString() {
        return "Dados do Carro \n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Cor: " + cor + "\n" +
                "Placa: " + placa + "\n";
    }
}
