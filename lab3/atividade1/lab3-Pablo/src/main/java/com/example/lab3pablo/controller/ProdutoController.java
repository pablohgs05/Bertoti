package com.example.lab3pablo.controller;

import com.example.lab3pablo.model.Produto;
import com.example.lab3pablo.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private ProdutoService produtoService = new ProdutoService();

    @GetMapping
    public List<Produto> getAllProdutos() {
        return produtoService.getAllProdutos();
    }

    @GetMapping("/{id}")
    public Produto getProdutoById(@PathVariable Long id) {
        return produtoService.getProdutoById(id);
    }

    @PostMapping
    public Produto addProduto(@RequestBody Produto produto) {
        return produtoService.addProduto(produto);
    }
}