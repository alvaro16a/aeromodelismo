package co.com.sofka.Pedido;

import co.com.sofka.Pedido.Values.ClienteID;
import co.com.sofka.Pedido.Values.Direccion;
import co.com.sofka.Pedido.Values.Persona;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cliente extends Entity<ClienteID> {

    private  Persona persona;
    private  Direccion direccion;

    public Cliente(ClienteID entityId, Persona persona, Direccion direccion) {
        super(entityId);
        this.direccion = direccion;
        this.persona = persona;
    }

    public void modificarDireccionEntrega(Direccion direccion){
        this.direccion = Objects.requireNonNull(direccion);
    }

    public void modicarDatosPersonales(Persona persona){
        this.persona = Objects.requireNonNull(persona);
    }


    public Persona persona() {
        return persona;
    }

    public Direccion direccion() {
        return direccion;
    }
}
