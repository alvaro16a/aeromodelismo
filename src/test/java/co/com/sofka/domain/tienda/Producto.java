package co.com.sofka.domain.tienda;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.tienda.valor.ProductoId;

public class Producto extends Entity<ProductoId>{

    public Producto(ProductoId productoId) {
        super(productoId);
    }
    
}
