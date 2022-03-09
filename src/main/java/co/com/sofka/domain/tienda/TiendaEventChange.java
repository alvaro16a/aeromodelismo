package co.com.sofka.domain.tienda;


import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.tienda.evento.ProductoCreado;
import co.com.sofka.domain.tienda.evento.TiendaCreada;

public class TiendaEventChange extends EventChange{

    public TiendaEventChange(Tienda tienda) {

        apply((TiendaCreada event) -> {});

        apply((ProductoCreado event) ->{

            tienda.producto = new Producto(event.getProductoId(),
                                            event.getNombre(),
                                            event.getDetalles(),
                                            event.getMoneda(),
                                            event.getMonto());

         });



       
    }

    
}
