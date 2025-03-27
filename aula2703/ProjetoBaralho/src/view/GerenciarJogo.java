package view;

import model.Baralho;
import model.Carta;

public class GerenciarJogo {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        System.out.println(baralho);
        System.out.println(); //pular uma linha
        //embaralhar
        baralho.embaralhar();
        System.out.println(baralho);
        //Vamos pegar duas cartas na ordem do baralho
        Carta carta1, carta2;
        carta1 = baralho.getCartas().get(0); //primeira carta
        carta2 = baralho.getCartas().get(1); //segunda carta

        //Qual é a maior das duas carta
        Carta cartaMaior = baralho.getMaiorCarta(carta1, carta2);
        System.out.println("A Maior carta é: " + cartaMaior);
    }
}
