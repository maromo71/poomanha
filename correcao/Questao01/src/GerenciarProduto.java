import model.Carrinho;
import model.Produto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GerenciarProduto {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<Produto>();
        Produto p1 = new Produto();
        p1.setIdProduto(1);
        p1.setNomeProduto("Coca-cola");
        p1.setPreco(3.0);
        p1.setAtivo(true);
        p1.setPrincipalFornecedor("Coca-cola ltda");
        p1.setQtdEstoque(0);

        produtos.add(p1);
        Produto p2 = new Produto();
        p2.setIdProduto(2);
        p2.setNomeProduto("Fanta");
        p2.setPreco(4.0);
        p2.setAtivo(true);
        p2.setPrincipalFornecedor("Coca-cola ltda");
        p2.setQtdEstoque(0);
        produtos.add(p2);

        Carrinho c1 = new Carrinho();
        c1.setIdCarrinho(1);
        c1.setDataCarrinho(null);
        c1.setItens(produtos); //IV

        c1.listarProdutos();


    }
}
