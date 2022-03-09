package Pedido.comands;

import Pedido.Values.Direccion;
import Pedido.Values.Persona;
import co.com.sofka.domain.generic.Command;

public class crearCliente extends Command {



    private final Persona persona;
    private final Direccion direccion;


    public crearCliente(Persona persona1, Direccion direccion1) {

        this.persona = persona1;
        this.direccion = direccion1;
    }

    public Persona getPersona() {
        return persona;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
