import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        long inicio, fim;
        int n = 2600000;
        inicio = System.currentTimeMillis();
        List<Pessoa> array = new ArrayList<>();
        for(int i=0; i<n;i++){
            array.add(new Pessoa(i, "Chico da Silva Junior " + i));
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo para inserir: " +
                (fim-inicio)/1000.0 + " segundo");
        inicio = System.currentTimeMillis();
        Iterator o = array.iterator();
        while(o.hasNext()){
            Pessoa x = (Pessoa) o.next();
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo para iterar: " +
                (fim-inicio)/1000.0 + " segundo");
    }

}

