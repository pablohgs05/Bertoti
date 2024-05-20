package com.example.bertoti;

public class ItemPedido {
    private String idItemPedido;
    private String idProduto;
    private int quantidade;
    private double preco;

    public ItemPedido(String idItemPedido, String idProduto, int quantidade, double preco) {
        this.idItemPedido = idItemPedido;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getIdItemPedido() {
        return idItemPedido;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public double calcularTotalItem() {
        return quantidade * preco;
    }

    public void atualizarPrecoItem(double novoPreco) {
        this.preco = novoPreco;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }
}
