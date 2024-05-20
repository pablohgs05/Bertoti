package com.example.bertoti;

public class Produto {
    private String idProduto;
    private String nome;
    private double preco;

    public Produto(String idProduto, String nome, double preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double calcularTotalVendas(int quantidadeVendida) {
        return quantidadeVendida * preco;
    }

    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void atualizarNome(String novoNome) {
        this.nome = novoNome;
    }
}
