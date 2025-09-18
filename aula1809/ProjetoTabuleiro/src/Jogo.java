import model.Tabuleiro;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        int p1, p2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite dois palpites, separados por Enter: ");
        p1 = Integer.parseInt(ler.nextLine());
        p2 = Integer.parseInt(ler.nextLine());
        Tabuleiro tabuleiro = new Tabuleiro();
        double premio = tabuleiro.jogar(p1, p2);
        if(premio>0){
            System.out.println("Parabéns. Seu premio eh: " + premio);
        }else{
            System.out.println("Que pena! Jogue de novo");
        }
    }
}
