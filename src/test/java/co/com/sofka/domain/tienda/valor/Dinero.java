package co.com.sofka.domain.tienda.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Dinero implements ValueObject<Dinero.Props>{

    private final String moneda;
    private final Integer monto;

    
    public Dinero(String moneda, Integer monto) {
        this.moneda =Objects.requireNonNull(moneda);
        if(monto > 0)
        this.monto = monto;
        else{
            throw new IllegalArgumentException("El objeto debe tener un valor mayor a cero");
        }
    }

    @Override
    public Props value() {
        return new Props(){
            
            @Override
            public String moneda() {
                return moneda;
            }

            @Override
            public Integer monto() {
                return monto;
            }
        };
    }

    public interface Props{
        String moneda();
        Integer monto();
    }
    
}
