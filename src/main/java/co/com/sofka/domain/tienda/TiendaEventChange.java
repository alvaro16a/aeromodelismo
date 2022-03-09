package co.com.sofka.domain.tienda;


import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.tienda.ProductoCreado;

public class TiendaEventChange extends EventChange{

    public TiendaEventChange(Tienda tienda) {

        ProductoCreado asda;
        asda.getProductoId()
        apply(PrpductoCreado event) -> {

            tienda.producto = new Producto(event.getProductoId(),    entityId, nombre, detalles, precio)
        }
       
    }

    
}
