package com.example.bertoti;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    public void testCalcularTotalVendas() {
        Produto produto = new Produto("P1", "Produto 1", 50.0);

        assertEquals(100.0, produto.calcularTotalVendas(2));
    }

    @Test
    public void testAtualizarPreco() {
        Produto produto = new Produto("P1", "Produto 1", 50.0);
        produto.atualizarPreco(60.0);

        assertEquals(60.0, produto.getPreco());
    }

    @Test
    public void testAtualizarNome() {
        Produto produto = new Produto("P1", "Produto 1", 50.0);
        produto.atualizarNome("Novo Produto");

        assertEquals("Novo Produto", produto.getNome());
    }
}
