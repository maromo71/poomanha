import java.util.ArrayList;
import java.util.List;

public class Exemplo06 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        //Cadastrando a coca cola
        Produto produto = new Produto();
        produto.setDescricao("Coca-cola");
        produto.setPreco(3.89);
        //coloca na lista
        produtos.add(produto);
        //criando e adicionando mais um produto na lista
        Produto produto1 = new Produto();
        produto1.setDescricao("Fanta Laranja");
        produto1.setPreco(3.27);
        produtos.add(produto1);
        //varrer a lista e imprimir cada um
        for(Produto prod : produtos){
            prod.imprimir();
        }
    }
}
