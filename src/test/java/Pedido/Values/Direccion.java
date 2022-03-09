package Pedido.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {

    private final String value;

    public Direccion(String value) {
        this.value = Objects.requireNonNull(value);
    }


    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Direccion)) return false;
        Direccion direccion = (Direccion) o;
        return Objects.equals(value, direccion.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
