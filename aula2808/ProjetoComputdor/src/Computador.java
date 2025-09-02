public class Computador {
    //Atributos
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    public void imprimir(){
        System.out.println("Marca: "+marca);
        System.out.println("Cor: "+cor);
        System.out.println("Modelo: "+modelo);
        System.out.println("Numero Serie: "+numeroSerie);
        System.out.println("Preco: "+preco);
    }
    public void calcularValor(){
        if(marca.equalsIgnoreCase("HP")){
            preco *= 1.30;
            return;
        }
        if(marca.equalsIgnoreCase("IBM")){
            preco *= 1.50;
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
