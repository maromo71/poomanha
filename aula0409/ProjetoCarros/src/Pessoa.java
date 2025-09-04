import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    public String nome;
    public String email;
    public String cidade;
    public List<Carro> carros = new ArrayList<>();

    public void imprimir(){
        System.out.println("nome = " + nome);
        System.out.println("email = " + email);
        System.out.println("cidade = " + cidade);
        System.out.println("Carros do cliente");
        System.out.println("-=-=-=-=-=-=-=-=-");
        for(Carro carro : carros){
            carro.imprimir();
        }
        System.out.println("=-=-=-=-=-=-=-==-=");
    }
}
