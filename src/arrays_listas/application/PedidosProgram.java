package arrays_listas.application;

import arrays_listas.entities.PedidosEnum;
import arrays_listas.entities.enums.OrdemStatus;

import java.util.Date;

public class PedidosProgram {
    public static void main(String[] args) {
        PedidosEnum pedido = new PedidosEnum(1080, new Date(), OrdemStatus.AGUARDANDO_PAGAMENTO);

        System.out.println(pedido);

        OrdemStatus os1 = OrdemStatus.ENTREGUE;
        OrdemStatus os2 =OrdemStatus.valueOf("ENTREGUE");
        System.out.println(os1);
        System.out.println(os2);
    }

}