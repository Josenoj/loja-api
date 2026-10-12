package com.loja.loja_api.controller;

import com.loja.loja_api.model.Pedido;
import com.loja.loja_api.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService){
        this.pedidoService = pedidoService;
    }

    @PostMapping("/pedidos")
    public ResponseEntity<Pedido> criarPedido(@RequestBody Pedido pedido){
        Pedido pedidoCriado = pedidoService.criarPedido(pedido);

        return ResponseEntity.status(201).body(pedidoCriado);
    }

    @GetMapping("/pedidos")
    public List<Pedido> listarPedidos(){
        return pedidoService.listarPedidos();
    }

    @GetMapping("/pedidos/{id}")
    public Pedido buscarPedidoPorId(@PathVariable Long id){
        return pedidoService.buscarPedidoPorId(id);
    }

    @DeleteMapping("/pedidos/{id}")
    public ResponseEntity<Void> deletarPedido(@PathVariable Long id){
        pedidoService.deletarPedido(id);

        return ResponseEntity.noContent().build();
    }
}
