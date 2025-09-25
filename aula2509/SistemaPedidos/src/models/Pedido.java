package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private long id;
    private Cliente cliente;
    private LocalDate data;
    private List<PedidoDetalhe> itens;

    public Pedido(long id, Cliente cliente){
        this.id = id;
        this.cliente = cliente;
        this.data = LocalDate.now(); //data atual
        this.itens = new ArrayList<>(); // inicializa a lista de itens (pedido detalhe)
    }
    public void adicionarItem(PedidoDetalhe item){
        this.itens.add(item);
    }
    public double calcularTotal(){
        double total = 0;
        for(PedidoDetalhe item : itens){
            total += item.getPrecoUnitario();
        }
        return total;
    }
    public void imprimirResumo() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("=========================================");
        System.out.println("            RESUMO DO PEDIDO");
        System.out.println("=========================================");
        System.out.println("ID do Pedido: " + this.id);
        System.out.println("Data: " + this.data.format(formatador));
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("-----------------------------------------");
        System.out.println("Itens do Pedido:");
        if (itens.isEmpty()) {
            System.out.println("   Nenhum item adicionado.");
        } else {
            for (PedidoDetalhe item : itens) {
                System.out.println(item);
            }
        }
        System.out.println("-----------------------------------------");
        System.out.printf("VALOR TOTAL DO PEDIDO: R$ %.2f\n", calcularTotal());
        System.out.println("=========================================\n");
    }

    public long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getData() {
        return data;
    }
}
