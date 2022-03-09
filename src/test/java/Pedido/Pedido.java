package Pedido;

import Pedido.Values.ClienteID;
import Pedido.Values.Direccion;
import Pedido.Values.PedidoID;
import Pedido.Values.Persona;
import Pedido.events.ClienteCreado;
import Pedido.events.ClienteModificado;
import Pedido.events.PedidoCreado;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class Pedido extends AggregateEvent<PedidoID> {

    protected Cliente cliente;
    protected TiendaID tiendaID;
    //protected CotizacionID cotizacionID;


    public Pedido(PedidoID entityId, Cliente cliente) {
        super(entityId);
        appendChange(new PedidoCreado(cliente)).apply();
    }

    private Pedido (PedidoID entityId){
        super(entityId);
        subscribe(new PedidoChange(this));
    }

    public static Pedido from(PedidoID pedidoID, List<DomainEvent> events){
        var pedido = new Pedido(pedidoID);
        events.forEach(pedido::applyEvent);
        return pedido;
    }


    public void consultarTienda(TiendaID tiendaID){

        appendChange(new TiendaConsultada(tiendaID) );
    }

    public void crearCliente(Persona persona, Direccion direccion){

        Objects.requireNonNull(persona);
        Objects.requireNonNull(direccion);
        appendChange(new ClienteCreado( persona,direccion)).apply();
    }

    public void modificarCliente (ClienteID entityId, Persona persona, Direccion direccion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(persona);
        Objects.requireNonNull(direccion);
        appendChange(new ClienteModificado(entityId, persona,direccion)).apply();
    }


    public Cliente cliente() {
        return cliente;
    }

    public TiendaID tiendaID() {
        return tiendaID;
    }
}
