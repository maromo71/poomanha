import java.util.ArrayList;
import java.util.List;

public class BibliotecaTeste {
    private List<Livro> listaLivros = new ArrayList<>();

    public static void main(String[] args) {

        int resultado = 1;
        for (int i = 1; i < 5; i++) {
            if (i % 2 != 0) {
                resultado *= i;
            }
        }
        System.out.print(resultado);


    }

    //Questao 2 - valiam 2 pontos
    public Livro buscarLivroPorCodigo(int codigo) {
        for (Livro livro : listaLivros) {
            if (livro.getCodigo() == codigo) {
                return livro;
            }
        }
        return null;
    }
}
