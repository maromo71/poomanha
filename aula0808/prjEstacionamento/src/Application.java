import model.Carro;

public class Application {
    public static void main(String[] args) {
        //Quero representar dois carros, sendo que:
        //o Primeiro deles irá estacionar na lateral esquerda
        //o Segundo deles será exibido os seus dados
        //Objeto carro1
        Carro carro1 = new Carro();
        carro1.placa = "ABC-1234";
        carro1.modelo = "Gol";
        carro1.marca = "Volkswagen";
        carro1.ano = 2015;

        //Objeto carro2
        Carro carro2 = new Carro();
        carro2.placa = "DEF-5678";
        carro2.modelo = "Onix";
        carro2.marca = "Chevrolet";
        carro2.ano = 2017;


        //Parar o carro1
        carro1.parar();
        System.out.println();

        //Estacionar o carro1
        carro1.estacionar();
        System.out.println();

        //Exibir os dados  do carro2
        carro2.exibirInformacoes();

    }
}
