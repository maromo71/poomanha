package model;

import java.util.Random;

public class Tabuleiro {
    int matriz[][] = new int[10][10];
    int palpites[] = new int[2];

    public Tabuleiro() {
        Random gerar = new Random();
        //geração de 100 valores entre 1 e 100
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = gerar.nextInt(100) + 1;
            }
        }
    }

    public double executarJogo(int p1, int p2) {
        palpites[0] = p1;
        palpites[1] = p2;
        int acertos = verificarAcertos();
        mostrarTabuleiro();
        if (acertos >= 3) {
            return acertos * 1000.0;
        } else {
            return 0;
        }
    }

    private int verificarAcertos() {
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == palpites[0] || matriz[i][j] == palpites[1]) {
                    cont++;
                }
            }
        }
        return cont;
    }

    private void mostrarTabuleiro() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == palpites[0] || matriz[i][j] == palpites[1]) {
                    System.out.printf("[%3d]** ", matriz[i][j]);
                } else {
                    System.out.printf("[%3d]   ", matriz[i][j]);
                }
            }
            System.out.println();//pular linha ao terminar 10 colunas
        }
    }
}

