package co.com.sofka.domain.tienda.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Dinero implements ValueObject<Dinero.Props>{

    private final String moneda;
    private final Integer monto;

    
    public Dinero(String moneda, Integer monto) {
        //Reglas de dominio nombre de la moneda y valores no negativos
        this.moneda =Objects.requireNonNull(moneda);
        if(monto <= 0){
            throw new IllegalArgumentException("El objeto no puede tener un valor negativo");
        }
        this.monto = monto;
 
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
