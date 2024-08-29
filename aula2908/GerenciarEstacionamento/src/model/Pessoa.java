package model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    //atributos privados
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private List<Carro> carros = new ArrayList<>();

    //getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Construtor
    public Pessoa(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }
    public Pessoa(){

    }

    //toString


    @Override
    public String toString() {
        return "Dados da Pessoa: \n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Telefone: " + telefone + "\n" +
                "Email: " + email + "\n";
    }
    //Metódos
    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }

    public void exibirCarros(){
        System.out.println("Carros do cliente: " + nome);
        for(Carro carro : carros){
            System.out.println(carro);
        }
        System.out.println("--------------------------");
    }
}
