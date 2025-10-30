import model.Produto;

public class AppEstoque {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Bola de Gude", 1.50);
        //Simule um menu com opcoes para usuario (entrada, saida, ou ver o saldo)
        try{
            //Lembrando que é necessario colocar as duas linha abaixo
            //dentro do try, pois trata-se de checked excection
            produto.registrarEntrada(100);
            produto.registrarSaida(30);
            System.out.println(produto.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
