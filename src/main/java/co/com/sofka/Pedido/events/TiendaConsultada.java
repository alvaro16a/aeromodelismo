package co.com.sofka.Pedido.events;

import co.com.sofka.domain.generic.DomainEvent;

public class TiendaConsultada extends DomainEvent {

    private final TiendaID tiendaID;

    public TiendaConsultada(TiendaID tienda) {
        super("sofka.tienda.tiendaconsultada");
        this.tiendaID = tienda;
    }

    public TiendaID getTiendaID() {
        return tiendaID;
    }
}
