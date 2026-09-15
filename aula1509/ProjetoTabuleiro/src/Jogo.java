import model.Tabuleiro;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Tabuleiro tabu = new Tabuleiro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro palpite [0 a 100]: ");
        int palpite1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o segundo palpite [0 a 100]: ");
        int palpite2 = Integer.parseInt(scanner.nextLine());

        double premio = tabu.jogar(palpite1, palpite2);
        if(premio == 0){
            System.out.println("Infelizmente nao foi dessa vez..");
        }else{
            System.out.println("Parabéns! seu premio R$ " + premio);
        }
    }
}
