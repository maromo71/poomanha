/**
 * Questão 1
 * Questão 2
 */
public class Computador {
    private int idComputador;
    private String descricao;
    private int qtdMemoria;
    private double valor;

    //Apenas um par como um dos abaixo:
    public int getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(int idComputador) {
        this.idComputador = idComputador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    //Questão 2
    //listarDados()
    private void listarDados() {
        System.out.println("ID: " + idComputador);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade de Memória: " + qtdMemoria);
        System.out.println("Valor: " + valor);
    }
    //Questão 2
    //atualizarPreco(Usuario usu, double preco):boolean
    public boolean atualizarPreco(Usuario usu, double preco) {
        //importante era observar a visibilidade
        //do atributo nivel. Só acesso via get
        if (usu.getNivel() == 2) {
            this.valor = preco;
            return true;
        } else {
            return false;
        }
    }
}
