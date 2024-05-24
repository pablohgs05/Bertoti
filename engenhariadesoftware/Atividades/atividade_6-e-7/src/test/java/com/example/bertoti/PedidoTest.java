package com.example.bertoti;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void testAdicionarItem() {
        Cliente cliente = new Cliente("1", "Pablo", "pablohenrique@gmail.com");
        Pedido pedido = new Pedido("1", cliente);
        ItemPedido item = new ItemPedido("1", "P1", 2, 50.0);

        pedido.adicionarItem(item);

        assertEquals(1, pedido.getItens().size());
        assertEquals(item, pedido.getItens().get(0));
    }

    @Test
    public void testCalcularTotalPedido() {
        Cliente cliente = new Cliente("1", "Pablo", "pablohenrique@gmail.com");
        Pedido pedido = new Pedido("1", cliente);
        ItemPedido item1 = new ItemPedido("1", "P1", 2, 50.0);
        ItemPedido item2 = new ItemPedido("2", "P2", 1, 100.0);

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        assertEquals(200.0, pedido.calcularTotalPedido());
    }
}
