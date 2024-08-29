import model.Carro;
import model.Pessoa;

public class GerenciarEstacionamento {

    public static void main(String[] args) {
       //Tres carros, dois deles de uma pessoa e outro da segunda pessoa
        Pessoa pessoa1 = new Pessoa(
                "Maria",
                "111.111.111-88",
                "19-9090-9090",
                "maria@gmail.com"
        );
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Ricardo");
        pessoa2.setCpf("222.222.222-22");
        pessoa2.setTelefone("19.8080-8080");
        pessoa2.setEmail("ricardo@gmail.com");
        //Definindo os tres carros
        Carro carro1 = new Carro(
                "Fiat",
                "Pulse",
                "Branco",
                "FFF-9P999"
         );
        Carro carro2 = new Carro(
                "Fiat",
                "Uno",
                "Branco",
                "GGG-9P999"
        );
        Carro carro3 = new Carro(
                "Chevrolet",
                "Monza",
                "Branco",
                "VEI-0001"
        );
        //Adicionar os carros as pessoas corretas
        pessoa1.adicionarCarro(carro1);
        pessoa1.adicionarCarro(carro2);
        pessoa2.adicionarCarro(carro3);

        //Listar os dados da Maria e os carros dela
        System.out.println(pessoa1);
        pessoa1.exibirCarros();
        //Lista os dados do Ricardo e o carro delo
        System.out.println(pessoa2);
        pessoa2.exibirCarros();

    }

}
