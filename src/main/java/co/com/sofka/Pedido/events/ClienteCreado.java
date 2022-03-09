package co.com.sofka.Pedido.events;

import co.com.sofka.Pedido.Values.Direccion;
import co.com.sofka.Pedido.Values.Persona;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteCreado extends DomainEvent {

    private final Persona persona;
    private final Direccion direccion;

    public ClienteCreado(Persona persona, Direccion direccion) {
        super("sofka.cliente.clientecreado");
        this.direccion = direccion;
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
