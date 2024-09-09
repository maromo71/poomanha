import model.Usuario;

public class Teste {
    public static void main(String[] args) {
        //Entra no construtor padrao
        Usuario usuario = new Usuario();

        //Entra no construtor com usuario e senha
        Usuario usuario1 = new Usuario(111, "abc");

        //Entra no consturor com todos os parametros
        Usuario usuario2 = new Usuario(222,"Maromo", "maromo@gmail.com",
                "abcd", "professor", "nivel 1");
    }



}
