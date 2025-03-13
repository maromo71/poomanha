package models;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private List<Carro> carros = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   public void adicionarCarro(Carro carro){
        carros.add(carro);
   }

   public void removerCarro(Carro carro){
        carros.remove(carro);
   }

   public void imprimir(){
       System.out.println("Dados da Pessoa Cadastrada: ");
       System.out.println("Nome da pessoa: " + nome);
       System.out.println("Idade da pessoa: " + idade);
       System.out.println("Email da pessoa: " + email);
       if(carros.isEmpty()){
           System.out.println("Cliente ainda não registrou seu(s) carro(s)");
       }else{
           System.out.println("Total de carros do cliente: " + carros.size());
           //varrer a lista de carros dessa pessoa
           for(Carro carro: carros){
               carro.imprimirCarro();
           }
       }
   }


}
