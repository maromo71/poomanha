package model;

public class Esfera {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularVolumeEsfera(){
        return 4/3.0 * Math.PI * Math.pow(raio, 3);
    }
}
