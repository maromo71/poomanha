import model.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GerenciarProduto {
    List<Produto> lista = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        GerenciarProduto gp = new GerenciarProduto();
        int opcao = 0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar Produto ");
            System.out.println("2. Comprar Produto");
            System.out.println("3. Vender Produto");
            System.out.println("4. Remover Produto");
            System.out.println("5. Listar Produtos");
            System.out.println("6. Saldo de Produto");
            System.out.println("7. Ordenar por codigo");
            System.out.println("9. Sair");
            System.out.printf("Sua opção: ");
            opcao = Integer.parseInt(gp.sc.nextLine());
            switch (opcao){
                case 1:
                    gp.execCadastrarProduto();
                    break;
                case 2:
                    gp.execComprar();
                    break;
                case 3:
                    gp.execVender();
                    break;
                case 4:
                    gp.execRemoverProduto();
                    break;
                case 5:
                    gp.execListar();
                    break;
                case 6:
                    gp.execSaldo();
                    break;
                case 7:
                    gp.execOrdernar();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=9);

    }

    private void execOrdernar() {
        Collections.sort(lista);
    }

    public void execComprar(){
        try{
            System.out.println("Digite o código do produto comprado: ");
            int codigo = Integer.parseInt(sc.nextLine());
            Produto produtoComprado = new Produto(codigo);
            if(lista.contains(produtoComprado)){
                int index = lista.indexOf(produtoComprado);
                produtoComprado = lista.get(index);
                System.out.println("Quantidade comprada de " + produtoComprado.getDescricao());
                int quantidadeComprada = Integer.parseInt(sc.nextLine());
                produtoComprado.comprar(quantidadeComprada);
                System.out.println("Quantidade atual: " + produtoComprado.getEstoque());
                System.out.println("Compra Registrada");
            }else{
                System.out.println("Produto não encontrado");
            }
        }catch (Exception o){
            System.out.println("Favor verificar as entradas. Tente novamente");
        }

    }

    public void execVender(){
        try{
            System.out.println("Digite o código do produto vendido: ");
            int codigo = Integer.parseInt(sc.nextLine());
            Produto produtoVendido = new Produto(codigo);
            if(lista.contains(produtoVendido)){
                int index = lista.indexOf(produtoVendido);
                produtoVendido = lista.get(index);
                System.out.println("Quantidade comprada de " + produtoVendido.getDescricao());
                int quantidadeComprada = Integer.parseInt(sc.nextLine());
                produtoVendido.vender(quantidadeComprada);
                System.out.println("Quantidade atual: " + produtoVendido.getEstoque());
                System.out.println("Venda Registrada");
            }else{
                System.out.println("Produto não encontrado");
            }
        }catch (Exception o){
            System.out.println("Favor verificar as entradas. Tente novamente");
        }
    }

    public void execListar(){
        for(Produto p : lista){
            System.out.println(p);
        }
    }

    public void execSaldo(){
        try{
            System.out.println("Digite o código do produto: ");
            int codigo = Integer.parseInt(sc.nextLine());
            Produto produto = new Produto(codigo);
            if(lista.contains(produto)){
                int index = lista.indexOf(produto);
                produto = lista.get(index);
                System.out.println("Saldo do Produto");
                System.out.println(produto.getEstoque());
            }else{
                System.out.println("Produto não encontrado");
            }
        }catch (Exception o){
            System.out.println("Favor verificar as entradas. Tente novamente");
        }
    }
    public void execCadastrarProduto(){
        try{
            System.out.println("Digite o código do Produto: ");
            int codigo = Integer.parseInt(sc.nextLine());
            System.out.println("Digite a descrição do Produto: ");
            String descricao = sc.nextLine();
            System.out.println("Digite o valor do Produto: ");
            double valor = Double.parseDouble(sc.nextLine());
            Produto p = new Produto(codigo, descricao, valor);
            lista.add(p);
            System.out.println("Produto cadastrado com sucesso");
        }catch (Exception e){
            System.out.println("Erro na solicitação. Favor executar novamente");
        }

    }

    public void execRemoverProduto(){
        try{
            System.out.println("Digite o código do produto a ser excluido: ");
            int codigo = Integer.parseInt(sc.nextLine());
            Produto produtoExcluir = new Produto(codigo);
            if(lista.contains(produtoExcluir)){
                lista.remove(produtoExcluir);
                System.out.println("Produto Excluído");
            }else{
                System.out.println("Produto não encontrado");
            }
        }catch (Exception o){
            System.out.println("Favor verificar as entradas. Tente novamente");
        }
    }
}