public class ComputadorTeste {
    public static void main(String[] args) {
        //a) Instancie e popule um computador
        Computador c = new Computador();
        c.setIdComputador(1);
        c.setDescricao("Computador 1");
        c.setQtdMemoria(16);
        c.setValor(3000);
        //b) Instancie um usuario passando o nivel como 2
        Usuario u = new Usuario();
        u.setNivel(2);
        //c) Invoque o metodo atualizarPreco passando
        //1000 para o valor. Tem que passar o usuario
        boolean atualizado =  c.atualizarPreco(u, 1000);
        //importante aqui foi verificar o retorno
        //pois so atualiza se o usuario for de nivel = 2
        if(atualizado){
            System.out.println("Preço atualizado");
        }else{
            System.out.println("Preço não atualizado");
        }
        System.out.println("Preco do computador: " + c.getValor());
    }
}
