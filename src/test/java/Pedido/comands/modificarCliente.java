package Pedido.comands;

import Pedido.Values.ClienteID;
import Pedido.Values.Direccion;
import Pedido.Values.Persona;
import co.com.sofka.domain.generic.Command;

public class modificarCliente extends Command {

    private final ClienteID clienteId;
    private final Persona persona;
    private final Direccion direccion;


    public modificarCliente(ClienteID clienteId, Persona persona1, Direccion direccion1) {
        this.clienteId = clienteId;
        this.persona = persona1;
        this.direccion = direccion1;
    }

    public ClienteID getClienteId() {
        return clienteId;
    }

    public Persona getPersona() {
        return persona;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}