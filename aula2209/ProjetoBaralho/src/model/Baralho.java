package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas = new ArrayList<>();

    public Baralho(){
        montar();
    }
    public void montar(){
        //construir um novo baralho com 52 cartas dentro
        for(Naipe naipe : Naipe.values()){
            for(Valor valor : Valor.values()){
                Carta carta = new Carta(naipe, valor);
                cartas.add(carta);
            }
        }
    }
    public void embaralhar(){
        Collections.shuffle(cartas);
    }
    public void exibir(){
        for(Carta carta : cartas){
            System.out.println(carta);
        }
    }

    public Carta maiorValor(Carta carta1, Carta carta2){
        if(carta1.getValor() != carta2.getValor()){
            //valores diferentes
            if(carta1.getValor().ordinal() > carta2.getValor().ordinal()){
                return carta1;
            }else{
                return carta2;
            }
        }else{
            //valores iguais
            if(carta1.getNaipe().ordinal() > carta2.getNaipe().ordinal()){
                return carta1;
            }else{
                return carta2;
            }
        }
    }

    public List<Carta> getCartas() {
        return cartas;
    }
}
