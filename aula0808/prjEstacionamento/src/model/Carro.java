package model;

public class Carro {

    public String placa;
    public String modelo;
    public String marca;
    public int ano;

    public void estacionar(){
        System.out.println("Carro estacionado modelo: " + modelo);
    }

    public void parar(){
        System.out.println("Carro parado, modelo: " + modelo);
    }

    public void exibirInformacoes(){
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}
