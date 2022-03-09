package co.com.sofka.domain.tienda.evento;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.tienda.valor.ProductoId;

public class Productoeditado extends DomainEvent {

    private final ProductoId productoId;
    private final String nombre;
    private final String detalles;
    private final String moneda;
    private final Integer monto;

    public Productoeditado(ProductoId productoId, String nombre, String detalles, String moneda, Integer monto) {
        super("tienda.productoeditado");
        this.productoId=productoId;
        this.nombre = nombre;
        this.detalles=detalles;
        this.moneda=moneda;
        this.monto=monto;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDetalles() {
        return detalles;
    }

    public String getMoneda() {
        return moneda;
    }

    public Integer getMonto() {
        return monto;
    }
}
