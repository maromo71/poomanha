import model.Baralho;
import model.Carta;

public class GerenciarJogo {

    private Baralho baralho;

    public static void main(String[] args) {
        GerenciarJogo gerenciar = new GerenciarJogo();
        gerenciar.baralho = new Baralho();
        System.out.println("Baralho Montado para o Jogo");
        for(Carta carta : gerenciar.baralho.getBaralho()){
            System.out.println(carta);
        }
        System.out.println("Fim do Baralho");
        System.out.println();
        //embaralhar
        gerenciar.baralho.embaralhar();
        System.out.println("Baralho Bagunçado");
        for(Carta carta : gerenciar.baralho.getBaralho()){
            System.out.println(carta);
        }
    }
}
