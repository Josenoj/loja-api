package com.loja.loja_api.controller;

import com.loja.loja_api.model.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.loja.loja_api.service.ProdutoService;

import java.util.List;

@RestController
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @PostMapping("/produtos")
    public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto){
        Produto produtoCriado = produtoService.criarProduto(produto);

        return ResponseEntity.status(201).body(produtoCriado);
    }

    @GetMapping("/produtos")
    public List<Produto> listarProdutos(){
        return produtoService.listarProdutos();
    }

    @GetMapping("/produtos/{id}")
    public Produto buscarProdutoPorId(@PathVariable Long id){
        return produtoService.buscarProdutoPorId(id);
    }

    @DeleteMapping("/produtos/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);

        return  ResponseEntity.noContent().build();
    }
}
