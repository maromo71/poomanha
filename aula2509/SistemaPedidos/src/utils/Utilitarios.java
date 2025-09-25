package utils;
import models.Cliente;
import models.Produto;
import java.util.ArrayList;
import java.util.List;

public class Utilitarios {

    public static List<Cliente> carregarClientes(){
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1, "Marcos Moraes", "maromo@gmail.com"));
        clientes.add(new Cliente(2, "Maria Santos", "mssantos@gmail.com"));
        clientes.add(new Cliente(3, "Tereza Mata", "tereza@gmail.com"));
        clientes.add(new Cliente(4, "Marjori Do outro ano", "marjori@gmail.com"));
        return clientes;
    }

    public static List<Produto> carregarProdutos(){
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(101, "Notebook Gamer", 4500.00));
        produtos.add(new Produto(102, "Mouse sem fio", 120.50));
        produtos.add(new Produto(103, "Teclado USB", 112.45));
        produtos.add(new Produto(104, "Monitor LCD 18p ", 600.45));
        produtos.add(new Produto(105, "SSD 1TB", 500.00));
        return produtos;
    }

}
