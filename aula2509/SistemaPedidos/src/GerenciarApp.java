import models.Cliente;
import models.Pedido;
import models.PedidoDetalhe;
import models.Produto;
import utils.Utilitarios;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarApp {

    //Listas para armazenar dados na memoria (provisorio)
    private static List<Cliente> clientes;
    private static List<Produto> produtos;
    private static List<Pedido> pedidos = new ArrayList<>();
    private static long proximoIdPedido = 1;

    public static void main(String[] args) {
        //1. DAR UMA CARGA INICIAL NOS CLIENTES E PRODUTOS
        clientes = Utilitarios.carregarClientes();
        produtos = Utilitarios.carregarProdutos();

        Scanner sc = new Scanner(System.in);
        System.out.println("SISTEMA DE PEDIDOS DE PRODUTO - TELA INICIAL");
        int opcao = 0;
        do{
            exibirMenuPrincial();
            opcao = Integer.parseInt(sc.nextLine());
            switch(opcao){
                case 1:
                    efetuarPedido(sc);
                    break;
                case 2:
                    listarPedidos();
                    break;
                case 0:
                    System.out.println("Fim do Programa. Obrigado por utilizar o sistema");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente");
            }
        }while(opcao!=0);
    }

    public static void listarPedidos(){
        System.out.println("------ LISTA DE TODOS OS PEDIDOS ----------");
        if(pedidos.isEmpty()){
            System.out.println("Nenhum pedido foi encontrado.");
        }else{
            for (Pedido pedido: pedidos){
                pedido.imprimirResumo();
            }
        }
    }
    public static void efetuarPedido(Scanner sc){
        System.out.println("\n------- EFETUAR NOVO PEDIDO -------");
        //1. passo. Selecionar o cliente
        System.out.println("Selecione o id do cliente: ");
        for(Cliente c : clientes){
            System.out.println("Id: " + c.getId() + "| Nome: " + c.getNome());
        }
        int idCliente = Integer.parseInt(sc.nextLine());
        Cliente clienteSelecionado = null;
        for(Cliente c : clientes){
            if(c.getId() == idCliente){
                clienteSelecionado = c;
                break;
            }
        }
        if(clienteSelecionado == null){
            System.out.println("Cliente nao encontrado. Operacao cancelada");
            return;
        }
        //Passo 2 - Criar o pedido e adicionar itens
        Pedido novoPedido = new Pedido(proximoIdPedido, clienteSelecionado);
        System.out.println("Pedido criado para o cliente: " +
                clienteSelecionado.getNome());
        adicionarItemPedido(sc, novoPedido);
        proximoIdPedido++;

        //Passo 3 - Adicionar o pedido novo na lista de pedidos
        pedidos.add(novoPedido);
        System.out.println("Pedido Finalizado com sucesso");
        novoPedido.imprimirResumo();
    }

    public static void adicionarItemPedido(Scanner sc, Pedido pedido){
        int idProduto = -1;
        while(idProduto != 0){
            System.out.println("----ADICIONAR UM ITEM AO PEDIDO ----");
            System.out.println("Lista de Produtos disponíveis: ");
            for(Produto produto : produtos){
                System.out.println(produto);
            }
            System.out.println("-------------------------------------");
            System.out.println("Digite o id do produto  ou 0 para finalizar");
            idProduto = Integer.parseInt(sc.nextLine());
            if(idProduto == 0){
                break;
            }
            Produto produtoSelecionado = null;
            for(Produto produto : produtos){
                if(produto.getId() == idProduto){
                    produtoSelecionado = produto;
                    break;
                }
            }
            if(produtoSelecionado != null){
                System.out.println("Digite a quantidade do produto: ");
                int quantidade = Integer.parseInt(sc.nextLine());
                if(quantidade > 0){
                    PedidoDetalhe novoItem = new PedidoDetalhe(produtoSelecionado, quantidade);
                    pedido.adicionarItem(novoItem);
                    System.out.println("Pedido adicionado produto: "
                            + produtoSelecionado.getDescricao());
                }else{
                    System.out.println("Quantidade deve ser maior que zero");
                }
            }else{
                System.out.println("Produto nao encontrado. Operacao cancelada");
            }
        }
    }
    public static void exibirMenuPrincial(){
        System.out.println("|-------- MENU PRINCIPAL --------| ");
        System.out.println("| 1. Efetuar Pedido              | ");
        System.out.println("| 2. Listar Pedidos Efeetuados   | ");
        System.out.println("| 0. Sair                        | ");
        System.out.println("|-------- Escolha sua opcao:     |");
    }
}
