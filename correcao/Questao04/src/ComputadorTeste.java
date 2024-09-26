import model.Computador;
import model.Usuario;

public class ComputadorTeste {
    public static void main(String[] args) {
        Computador c1 = new Computador();
        c1.setIdComputador(1);
        c1.setNomeComputador("IBM");
        c1.setQtdMemoria(128);
        c1.setValor(5000);

        Usuario usuario = new Usuario();
        usuario.setNivel(2);

        if(c1.atualizarPreco(4000, usuario)==0){
            System.out.println("Preco atualizado");
        }else{
            System.out.println("Preco nao atualizado");
        }

        System.out.println(c1.getValor());
    }
}
