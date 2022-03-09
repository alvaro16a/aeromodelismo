package co.com.sofka.Pedido;

import co.com.sofka.Pedido.Values.ClienteID;
import co.com.sofka.Pedido.Values.Direccion;
import co.com.sofka.Pedido.Values.PedidoID;
import co.com.sofka.Pedido.Values.Persona;
import co.com.sofka.Pedido.events.ClienteCreado;
import co.com.sofka.Pedido.events.ClienteModificado;
import co.com.sofka.Pedido.events.PedidoCreado;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class Pedido extends AggregateEvent<PedidoID> {

    protected Cliente cliente;
    //protected TiendaID tiendaID;
    // protected CotizacionID cotizacionID;


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


    //public void consultarTienda(TiendaID tiendaID){
    //  validar nulos
    //    appendChange(new TiendaConsultada(tiendaID) );
    //}

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

    //public TiendaID tiendaID() {
     //   return tiendaID;
   // }
}
