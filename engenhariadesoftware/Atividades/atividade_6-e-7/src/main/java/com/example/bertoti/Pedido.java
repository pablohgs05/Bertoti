package com.example.bertoti;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String idPedido;
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido(String idPedido, Cliente cliente) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public String getIdPedido() {
        return idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
    }

    public void removerItem(String idItemPedido) {
        this.itens.removeIf(item -> item.getIdItemPedido().equals(idItemPedido));
    }

    public double calcularTotalPedido() {
        return itens.stream().mapToDouble(ItemPedido::calcularTotalItem).sum();
    }

    public ItemPedido obterItem(String idItemPedido) {
        return itens.stream().filter(item -> item.getIdItemPedido().equals(idItemPedido)).findFirst().orElse(null);
    }
}
