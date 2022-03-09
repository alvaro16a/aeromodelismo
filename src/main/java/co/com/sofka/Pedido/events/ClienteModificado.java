package co.com.sofka.Pedido.events;

import co.com.sofka.Pedido.Values.ClienteID;
import co.com.sofka.Pedido.Values.Direccion;
import co.com.sofka.Pedido.Values.Persona;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteModificado extends DomainEvent {

    private final ClienteID clienteID;
    private final Persona persona;
    private final Direccion direccion;

    public ClienteModificado(ClienteID entityId, Persona persona, Direccion direccion) {
        super("sofka.cliente.clientemodificado");
        this.clienteID = entityId;
        this.direccion = direccion;
        this.persona = persona;

    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public Persona getPersona() {
        return persona;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
