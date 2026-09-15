package model;

import java.util.Random;

public class Tabuleiro {
    private int[][] matriz = new int[10][10];
    private int[] palpites = new int[2];

    //Construtor personalizado (montar a matriz com
    //100 valores aleatorios entre 0 e 100 inclusive.
    public Tabuleiro(){
        Random aleatorio = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = aleatorio.nextInt(0, 101);
            }
        }
    }

    public double jogar(int p1, int p2){
        palpites[0] = p1;
        palpites[1] = p2;
        int totalDeAcertos = verificarNumerosAcertados();
        imprimirTabuleiro();
        if(totalDeAcertos >= 3){
            return totalDeAcertos * 1000;
        }else{
            return 0;
        }
    }

    private void imprimirTabuleiro() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(matriz[i][j]==palpites[0] || matriz[i][j]== palpites[1]){
                    System.out.printf("[%3d]* ", matriz[i][j]);
                }else{
                    System.out.printf("[%3d]  ", matriz[i][j]);
                }
            }
            System.out.println(); //pular linha
        }
    }

    private int verificarNumerosAcertados() {
        int tot = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(matriz[i][j] == palpites[0] || matriz[i][j]==palpites[1]){
                    tot++;
                }
            }
        }
        return tot;
    }
}
