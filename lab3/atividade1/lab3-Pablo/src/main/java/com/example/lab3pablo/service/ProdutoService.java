package com.example.lab3pablo.service;

import com.example.lab3pablo.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();

    public ProdutoService() {
        produtos.add(new Produto(1L, "Macarrão com farofa", 10.0));
        produtos.add(new Produto(2L, "Litro de coca-cola", 20.0));
    }

    public List<Produto> getAllProdutos() {
        return produtos;
    }

    public Produto getProdutoById(Long id) {
        return produtos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public Produto addProduto(Produto produto) {
        produtos.add(produto);
        return produto;
    }
}