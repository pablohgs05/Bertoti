package com.example.bertoti;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testAdicionarPedido() {
        Cliente cliente = new Cliente("1", "Pablo", "pablohenrique@gmail.com");
        Pedido pedido = new Pedido("1", cliente);

        cliente.adicionarPedido(pedido);

        assertEquals(1, cliente.obterPedidos().size());
        assertEquals(pedido, cliente.obterPedidos().get(0));
    }
}
