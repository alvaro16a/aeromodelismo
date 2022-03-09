package co.com.sofka.domain.tienda;

import java.util.List;
import java.util.Objects;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.tienda.valor.*;

public class Compra extends Entity<CompraId>{

    
    public Compra(CompraId entityId) {
        super(entityId);
    }

    List<ProductoId> productos;

    public Compra(CompraId entityId, ProductoId productoId) {
        super(entityId);
        this.productos.add(productoId);
    }

    public void AgregarProductoLista(ProductoId productoId){

        if(productos.contains(productoId)){
            throw new IllegalArgumentException("No se puede agregar el producto porque ya esta en la compra");
        }
        this.productos.add(productoId);
    }

    public void EliminarProductoLista(ProductoId productoId){

        if(!productos.contains(productoId)){
            throw new IllegalArgumentException("No se puede eliminar un producto que no esta en la compra");
        }
        this.productos.remove(productoId);
    }

    public void EliminarProductos(){

        if(productos.size()==0){
            throw new IllegalArgumentException("no se pueden eliminar productos que no se han agregado");
        }

        this.productos.clear();
    }

}
