package Pedido;

import Pedido.events.PedidoCreado;
import co.com.sofka.domain.generic.EventChange;

public class PedidoChange extends EventChange {
    public PedidoChange(final Pedido pedido){
        apply((PedidoCreado event)->{
            pedido.cliente = event.getCliente();
            //pedido.tienda = event.getTienda();
        });

        //apply((TiendaConsultada event) ->{
        //    pedido.tienda = event.getTiendaID();
       // });

    }
}
