import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploMetodos {
    public static void main(String[] args) {
        List lista = new ArrayList();
        //adicionar na lista
        lista.add(23);
        lista.add("Maria");
        lista.add(System.currentTimeMillis());
        lista.add("José");
        lista.add(23.3);
        lista.add("Maria");
        //numeros de elementos da lista
        System.out.println("Total: " + lista.size());
        //apresentar os elementos um Iterador
        Iterator elemento = lista.iterator();
        while(elemento.hasNext()){
            System.out.println(elemento.next());
        }
        //Iterando pelo foreach
        System.out.println(); //pular linha
        for(Object x : lista){
            System.out.println(x);
        }
        if(lista.contains("Maria")) {
            System.out.println("Tem Maria");
        }else{
            System.out.println("Não tem maria");
        }
        lista.remove("José");
        //Iterando pelo foreach
        System.out.println(); //pular linha
        for(Object x : lista){
            System.out.println(x);
        }
        lista.remove((Integer) 23);
        System.out.println(); //pular linha
        for(Object x : lista){
            System.out.println(x);
        }
        while(lista.contains("Maria")) lista.remove("Maria");
        System.out.println(); //pular linha
        for(Object x : lista){
            System.out.println(x);
        }

    }
}
