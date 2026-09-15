package model;

public class Funcionario {
    private int registro;
    private String nomeFuncionario;
    private MesBonificacao mesBonificacao;

    public Funcionario(int registro, String nomeFuncionario, MesBonificacao mesBonificacao) {
        this.registro = registro;
        this.nomeFuncionario = nomeFuncionario;
        this.mesBonificacao = mesBonificacao;
    }

    public void imprimir(){
        System.out.println("registro = " + registro);
        System.out.println("nomeFuncionario = " + nomeFuncionario);
        System.out.println("mesBonificacao = " + mesBonificacao);
    }
}
