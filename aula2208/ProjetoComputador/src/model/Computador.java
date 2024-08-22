package model;

public class Computador {
    //atributos
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    //metodos
    public void imprimir(){
        System.out.println("Marca ===========> " + marca);
        System.out.println("Cor =============> " + cor);
        System.out.println("Modelo ==========> " + modelo);
        System.out.println("Número de Série => " + numeroSerie);
        System.out.println("Preço ===========> " + preco);
        System.out.println();
    }
    public void calcularValor(){
        if(marca.equalsIgnoreCase("HP")){
            preco *= 1.3;
            return;
        }
        if(marca.equalsIgnoreCase("IBM")){
            preco *= 1.5;
        }
    }
    public boolean alterarValor(double valor){
        if(valor > 0){
            preco = valor;
            return true;
        }
        return false;
    }

}
