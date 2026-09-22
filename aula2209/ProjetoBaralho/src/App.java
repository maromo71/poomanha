import model.Baralho;
import model.Carta;

public class App {
    public static void main(String[] args) throws Exception {
        Baralho baralho = new Baralho();
        System.out.println("Baralho montado");
        System.out.println("------------------");
        baralho.exibir();
        System.out.println("Baralho misturado");
        System.out.println("------------------");
        baralho.embaralhar();
        baralho.exibir();
        Carta cartaRetirada1 = baralho.getCartas().get(0);
        baralho.getCartas().remove(0);
        Carta cartaRetirada2 = baralho.getCartas().get(0);
        baralho.getCartas().remove(0);
        System.out.println("A maior carta das duas foi: ");
        Carta cartaMaior = baralho.maiorValor(cartaRetirada1, cartaRetirada2);
        System.out.println(cartaMaior);
    }
}
