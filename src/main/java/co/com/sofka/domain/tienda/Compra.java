package co.com.sofka.domain.tienda;

import java.util.List;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.tienda.valor.*;

public class Compra extends Entity<CompraId>{

    
    public Compra(CompraId entityId) {
        super(entityId);
    }

    List<ProductoId> productos;
    
}
