package arrays_listas.entities;

import arrays_listas.entities.enums.OrdemStatus;

import java.util.Date;

public class PedidosEnum {
     private Integer id;
     private Date momento;
     private OrdemStatus status;

     public PedidosEnum(){

     }

    public PedidosEnum(Integer id, Date momento, OrdemStatus status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public OrdemStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemStatus status) {
        this.status = status;
    }

    public String toString() {
        return "Pedido:  " +
                "id = " + id +
                ", momento = " + momento +
                ", status = " + status ;
    }
}
