package Pedido.events;

import Pedido.Values.Direccion;
import Pedido.Values.Persona;
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
