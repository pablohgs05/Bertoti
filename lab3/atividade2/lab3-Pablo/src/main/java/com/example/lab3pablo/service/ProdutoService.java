package com.example.lab3pablo.service;

import com.example.lab3pablo.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private List<Produto> produtos = new ArrayList<>();
    private long nextId = 1; // Variável que rastreia o próximo ID


    public List<Produto> getAllProdutos() {
        return produtos;
    }


    public Produto addProduto(Produto produto) {
        produto.setId(nextId++);
        produtos.add(produto);
        return produto;
    }


    public Produto getProdutoById(Long id) {
        Optional<Produto> produto = produtos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
        return produto.orElse(null);
    }
}
