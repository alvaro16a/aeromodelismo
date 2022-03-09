package co.com.sofka.Pedido.Values;


import co.com.sofka.domain.generic.Identity;

public class PedidoID extends Identity {

    public PedidoID(){

    }
    private PedidoID (String id){
        super(id);
    }
    public static PedidoID of(String id){
        return new PedidoID(id);
    }
}
