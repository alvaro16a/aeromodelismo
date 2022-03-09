package Pedido.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Persona implements ValueObject<Persona> {


    private String nombre;
    private String apellido;
    private String telefono;
    private String email;


    public Persona(String nombre, String apellido, String telefono, String email) {
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);
        this.telefono = Objects.requireNonNull(telefono);
        this.email = Objects.requireNonNull(email);
    }

    @Override
    public Persona value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(telefono, persona.telefono) && Objects.equals(email, persona.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, telefono, email);
    }
}
