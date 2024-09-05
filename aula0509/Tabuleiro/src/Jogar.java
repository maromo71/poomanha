import model.Tabuleiro;

import java.util.Scanner;

public class Jogar {
    public static void main(String[] args) {
        int[] valores = new int[2];
        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro palpite: ");
        valores[0] = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o segundo palpite: ");
        valores[1] = Integer.parseInt(sc.nextLine());
        double premio = tabuleiro.jogar(valores);
        if(premio > 0.0){
            System.out.println("Parabéns! Seu prêmio: " + premio);
        }else{
            System.out.println("Infelizmente não foi desta vez");
        }
    }
}
