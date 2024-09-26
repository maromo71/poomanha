package model;

public class Computador {
    private int idComputador;
    private String nomeComputador;
    private int qtdMemoria;
    private double valor;

    public int getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(int idComputador) {
        this.idComputador = idComputador;
    }

    public String getNomeComputador() {
        return nomeComputador;
    }

    public void setNomeComputador(String nomeComputador) {
        this.nomeComputador = nomeComputador;
    }

    public int getQtdMemoria() {
        return qtdMemoria;
    }

    public void setQtdMemoria(int qtdMemoria) {
        this.qtdMemoria = qtdMemoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void listarDados(){
        System.out.println("idComputador = " + idComputador);
        System.out.println("nomeComputador = " + nomeComputador);
        System.out.println("qtdMemoria = " + qtdMemoria);
        System.out.println("valor = " + valor);
    }

    public int atualizarPreco(double preco, Usuario usuario){
        if(usuario.getNivel()==2){
            valor = preco;
            return 0;
        }
        return 1;
    }
}
