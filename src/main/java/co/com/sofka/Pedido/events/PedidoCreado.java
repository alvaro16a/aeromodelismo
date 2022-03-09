package co.com.sofka.Pedido.events;

import co.com.sofka.Pedido.Cliente;
import co.com.sofka.domain.generic.DomainEvent;



public class PedidoCreado extends DomainEvent {

    private final Cliente cliente;

    public PedidoCreado(Cliente cliente) {
        super("sofka.pedido.pedidocreado");
        this.cliente = cliente;
    }

    public Cliente getCliente(){
        return cliente;
    }
}
