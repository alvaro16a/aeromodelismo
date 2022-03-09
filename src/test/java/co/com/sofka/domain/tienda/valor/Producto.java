package co.com.sofka.domain.tienda.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Producto implements ValueObject<Producto.Props>{

    private final String nombre;
    private final Dinero precio;

    
    public Producto(String nombre,String moneda, Integer monto) {
        
        this.nombre =Objects.requireNonNull(nombre);
        this.precio = new Dinero(moneda, monto);
    }

    @Override
    public Props value() {
        return new Props(){

            @Override
            public String nombre() {
                return nombre;
            }
            
            @Override
            public Dinero precio() {
                return precio;
            }
            
        };
    }

    public interface Props{
        String nombre();
        Dinero precio();
    }
    
}
