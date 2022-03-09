package co.com.sofka.domain.tienda;

import co.com.sofka.domain.generic.DomainEvent;

public class TiendaCreada extends DomainEvent{

    public TiendaCreada() {
        super("tienda.tiendacreada");
         
    }

}
