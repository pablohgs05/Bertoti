package com.example.bertoti;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    public void testCalcularTotalVendas() {
        Produto produto = new Produto("P1", "GTX-1650", 700.0);

        assertEquals(1400.0, produto.calcularTotalVendas(2));
    }

    @Test
    public void testAtualizarPreco() {
        Produto produto = new Produto("P1", "GTX-1650", 700.0);
        produto.atualizarPreco(850.0);

        assertEquals(850.0, produto.getPreco());
    }

    @Test
    public void testAtualizarNome() {
        Produto produto = new Produto("P1", "GTX-1650", 700.0);
        produto.atualizarNome("GTX-1660");

        assertEquals("GTX-1660", produto.getNome());
    }
}
