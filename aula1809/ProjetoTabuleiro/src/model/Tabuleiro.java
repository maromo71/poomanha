package model;

import java.util.Random;

public class Tabuleiro {
    private int[][] matriz = new int[10][10];
    private int[] palpites = new int[2];

    //Construtor - Gerar valores aleatorios
    //para a matriz do tabuleiro
    public Tabuleiro(){
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                matriz[i][j] = r.nextInt(100) + 1;
            }
        }
    }
    public double jogar(int p1, int p2){
        palpites[0] = p1;
        palpites[1] = p2;
        int acertos = verificarPalpites();
        exibirTabuleiro();
        if(acertos >= 3){
            return 1000.0 * acertos;
        }else{
            return 0.0;
        }
    }

    public int verificarPalpites(){
        //percorrer o comparar com os palpites
        int acertos = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(palpites[0]==matriz[i][j] || palpites[1]==matriz[i][j]){
                    acertos++;
                }
            }
        }
        return acertos;
    }
    public void  exibirTabuleiro(){
       //destacar os acertados
       for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(palpites[0]==matriz[i][j] || palpites[1]==matriz[i][j]){
                    System.out.printf("[%3d]* ", matriz[i][j]);
                }else{
                    System.out.printf("[%3d]  ", matriz[i][j]);
                }
            }
           System.out.println();
        }
    }
}
