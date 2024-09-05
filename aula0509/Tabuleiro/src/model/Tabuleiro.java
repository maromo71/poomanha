package model;

import java.util.Random;

public class Tabuleiro {
    //atributos matriz e os palpites
    private int[][] matriz = new int[10][10];
    private int[]palpites = new int[2];

    public Tabuleiro(){
        //montar o tabuleiro
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                matriz[i][j] = random.nextInt(1, 101);
            }
        }
    }
    //proximo metodo - jogar (recebe dois palpites)
    public double jogar(int[] palpites){
        this.palpites = palpites; //recebe os palpites passados
        return verificar();
    }

    private double verificar() {
        //fazer a logica para procurar os palpites no tabuleiro
        int cont = 0;
        for(int p=0; p<2; p++){ //varrer os palpites
            for(int l=0; l<10; l++){
                for(int c=0; c<10; c++){
                    //verifica o acerto
                    if(palpites[p] == matriz[l][c]){
                        cont++;
                    }
                }
            }
        }
        exibirTabuleiro();
        return (cont > 2 ? cont * 1000.0 : 0.0);
    }

    private void exibirTabuleiro() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(matriz[i][j] == palpites[0] || matriz[i][j] == palpites[1]){
                    System.out.printf("[%3d]* ", matriz[i][j]);
                }else{
                    System.out.printf("[%3d]  ", matriz[i][j]);
                }
            }
            System.out.println(); //pular linha quando acaba valores da coluna
        }
    }
}
