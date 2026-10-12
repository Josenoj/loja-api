package com.loja.loja_api.controller;

import com.loja.loja_api.model.Cliente;
import com.loja.loja_api.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @PostMapping("/clientes")
    public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente) {

        Cliente clienteCriado = clienteService.criarCliente(cliente);

        return ResponseEntity.status(201).body(clienteCriado);
    }

    @GetMapping("/clientes")
    public List<Cliente> listarClientes(){
        return clienteService.listarClientes();
    }

    @GetMapping("/clientes/{id}")
    public Cliente buscarClientePorId(@PathVariable Long id){
        return clienteService.buscarCliente(id);
    }

    @DeleteMapping("clientes/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Long id){

        clienteService.deletarCliente(id);

        return ResponseEntity.noContent().build();
    }


}
