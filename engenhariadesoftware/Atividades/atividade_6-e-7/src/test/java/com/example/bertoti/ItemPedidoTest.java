package com.example.bertoti;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemPedidoTest {

    @Test
    public void testCalcularTotalItem() {
        ItemPedido item = new ItemPedido("1", "P1", 2, 50.0);

        assertEquals(100.0, item.calcularTotalItem());
    }

    @Test
    public void testAtualizarPrecoItem() {
        ItemPedido item = new ItemPedido("1", "P1", 2, 50.0);
        item.atualizarPrecoItem(60.0);

        assertEquals(60.0, item.getPreco());
    }

    @Test
    public void testAdicionarEstoque() {
        ItemPedido item = new ItemPedido("1", "P1", 2, 50.0);
        item.adicionarEstoque(3);

        assertEquals(5, item.getQuantidade());
    }
}
