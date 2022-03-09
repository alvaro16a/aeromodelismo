package co.com.sofka.domain.tienda;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.tienda.evento.ProductoCreado;
import co.com.sofka.domain.tienda.evento.Productoeditado;
import co.com.sofka.domain.tienda.evento.TiendaCreada;
import co.com.sofka.domain.tienda.valor.ProductoId;
import co.com.sofka.domain.tienda.valor.TiendaId;

public class Tienda extends AggregateEvent<TiendaId>{

    public Tienda(TiendaId tiendaId) {
        super(tiendaId);
        appendChange(new TiendaCreada()).apply();
        subscribe(new TiendaEventChange(this));
    }

    protected Producto producto;
    protected Compra compra;

    public void crearProducto(ProductoId entityId, String nombre, String detalles,String moneda, Integer monto){
        appendChange(new ProductoCreado(entityId,nombre,detalles,moneda,monto)).apply();
    }

    public void editarProducto(ProductoId entityId, String nombre, String detalles,String moneda, Integer monto){
        appendChange(new Productoeditado(entityId,nombre,detalles,moneda,monto)).apply();
    }



}