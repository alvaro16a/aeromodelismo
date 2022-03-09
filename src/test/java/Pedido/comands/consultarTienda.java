package Pedido.comands;

import Pedido.Values.PedidoID;
import co.com.sofka.domain.generic.Command;

public class consultarTienda extends Command {

    private final PedidoID pedidoID;
    private final TiendaID tiendaID;

    public consultarTienda(PedidoID pedidoID, TiendaID tiendaID) {
        this.pedidoID = pedidoID;
        this.tiendaID = tiendaID;
    }

    public PedidoID getPedidoID() {
        return pedidoID;
    }

    public TiendaID getTiendaID() {
        return tiendaID;
    }
}
