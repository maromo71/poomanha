package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas = new ArrayList<>();

    public List<Carta> getCartas() {
        return cartas;
    }

    public Baralho() {
        montar();
    }

    private void montar(){
        //montar as 52 cartas
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

    @Override
    public String toString() {
        StringBuilder meuString = new StringBuilder();
        //percorrer a lista
        for(Carta carta : cartas){
            meuString.append(carta).append("\n");
        }
        return meuString.toString();
    }

    public Carta getMaiorCarta(Carta c1, Carta c2){
        if(c1.getValor().ordinal() > c2.getValor().ordinal()){
            return c1;
        }
        if(c2.getValor().ordinal() > c1.getValor().ordinal()){
            return c2;
        }
        if(c1.getNaipe().ordinal() > c2.getNaipe().ordinal()){
            return c1;
        }else{
            return c2;
        }
    }
}
