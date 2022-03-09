package co.com.sofka.Pedido;

import co.com.sofka.Pedido.Values.PedidoID;
import co.com.sofka.Pedido.events.PedidoCreado;
import co.com.sofka.Pedido.events.TiendaConsultada;
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
