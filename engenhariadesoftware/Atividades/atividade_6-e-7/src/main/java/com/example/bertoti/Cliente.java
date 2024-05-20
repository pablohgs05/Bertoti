package com.example.bertoti;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String idCliente;
    private String nome;
    private String email;
    private List<Pedido> pedidos;

    public Cliente(String idCliente, String nome, String email) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.pedidos = new ArrayList<>();
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public List<Pedido> obterPedidos() {
        return pedidos;
    }

    public void adicionarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }
}
