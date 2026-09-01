import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private LocalDate dataNascimento;

    //Relacionamento (lista de carros)
    private List<Carro> carros = new ArrayList<>();

    //<editor-fold description="Métodos gets e sets">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void imprimir(){
        System.out.println("Dados completos da pessoa e seu(s) automovel(is)");
        System.out.println("------------------------------------------------");
        System.out.println("Nome da Pessoa: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Data Nascimento: " + dataNascimento);
        System.out.println("Telefone: " + telefone);
        if(carros.isEmpty()){
            System.out.println("Não possui automóvel");
        }else{
            for(Carro carro : carros){
                carro.imprimir();
            }
        }
        System.out.println("------------------------------------------------");
    }
    //</editor-fold>

    public void adicionarCarro(Carro carro){
        //Adicionar na lista de carros do cliente
        carros.add(carro);
    }

    public List<Carro> getCarros(){
        return carros;
    }

}
