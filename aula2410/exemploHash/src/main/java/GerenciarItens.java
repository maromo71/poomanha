import java.util.ArrayList;
import java.util.List;

public class GerenciarItens {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("Maria");
        lista.add("Ana");
        lista.add(System.currentTimeMillis());
        lista.add("Ana");
        lista.add(23);
        lista.add(23.89);
        lista.add("Ana");
        //tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size());
        for(Object obj : lista){
            System.out.println(obj);
        }
        System.out.println(lista.contains(24));
        while(lista.contains("Ana")) lista.remove("Ana");
        System.out.println("Tamanho da lista: " + lista.size());
        for(Object obj : lista){
            System.out.println(obj);
        }

    }
}
