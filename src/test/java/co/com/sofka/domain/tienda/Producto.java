package co.com.sofka.domain.tienda;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.tienda.valor.Dinero;
import co.com.sofka.domain.tienda.valor.ProductoId;

import java.util.Objects;

public class Producto extends Entity<ProductoId>{

    public Producto(ProductoId productoId) {
        super(productoId);
    }

    private String nombre;
    private String detalles;
    private Dinero precio;

    public Producto(ProductoId entityId, String nombre, String detalles, Dinero precio) {
        super(entityId);
        this.nombre = Objects.requireNonNull(nombre);
        this.detalles = detalles;
        this.precio = precio;
    }

    public Producto(ProductoId entityId, String nombre, String detalles,String moneda, Integer monto) {
        super(entityId);
        this.nombre = Objects.requireNonNull(nombre);
        this.detalles = detalles;
        this.precio =  new Dinero(moneda, monto);
    }

    public void modificarNombre(String nombre){
        this.nombre=Objects.requireNonNull(nombre);
    }

    public void modificarDetalles(String detalles){
        this.nombre=Objects.requireNonNull(detalles);
    }

    public void modificarPrecio(String moneda, Integer monto){
        this.precio =  new Dinero(moneda, monto);
    }

    
    
}
