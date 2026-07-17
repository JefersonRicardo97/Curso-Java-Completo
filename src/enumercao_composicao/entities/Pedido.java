package enumercao_composicao.entities;

import enumercao_composicao.entities.enums.StatusPedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date momento;
    private StatusPedido statusPedido;
    private Cliente cliente;

    static List<ItemPedido> itens = new ArrayList<>();

    public Pedido(){

    }

    public Pedido(Date momento, StatusPedido statusPedido, Cliente cliente) {
        this.momento = momento;
        this.statusPedido = statusPedido;
        this.cliente=cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
    public void addItem(ItemPedido item){
        itens.add(item);
    }
    public void removeItem(ItemPedido item){
        itens.remove(item);
    }
    public double total(){
        double soma = 0.0;
        for (ItemPedido item : itens){
            soma+= item.subTotal();
        }
        return soma;
    }

}

