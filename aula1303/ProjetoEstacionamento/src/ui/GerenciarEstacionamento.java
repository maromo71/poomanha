package ui;

import models.Carro;
import models.Pessoa;

public class GerenciarEstacionamento {
    // Simular um cliente com dois carros.
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setMarca("Fiat");
        carro1.setModelo("Pulse");
        carro1.setAnoFab(2023);
        carro1.setPlaca("HJU-0909");

        Carro carro2 = new Carro();
        carro2.setMarca("Hyundai");
        carro2.setModelo("Santa Fé");
        carro2.setAnoFab(2018);
        carro2.setModelo("FUJ-9090");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Maromo");
        pessoa1.setEmail("maromo@gmail.com");
        pessoa1.setIdade(37);

        //registrar os carros para a pessoa1.
        pessoa1.adicionarCarro(carro1);
        pessoa1.adicionarCarro(carro2);
        //imprimir os dados da pessoa 1.
        pessoa1.imprimir();

    }
}
