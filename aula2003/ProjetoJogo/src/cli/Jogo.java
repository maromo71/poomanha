package cli;

import model.Tabuleiro;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //pedir os dois palpites
        int p1, p2;
        System.out.println("Digite o primeiro numero: ");
        p1 = Integer.parseInt(input.nextLine());
        System.out.println("Digite o segundo numero: ");
        p2 = Integer.parseInt(input.nextLine());
        Tabuleiro tabuleiro = new Tabuleiro();
        double premio = tabuleiro.executarJogo(p1, p2);
        if(premio > 0){
            System.out.println("Parabéns!, Seu premio R$ " + premio);
        }else{
            System.out.println("Infelizmente nao foi desta vez");
        }
    }
}
