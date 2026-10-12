package com.loja.loja_api.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@JsonPropertyOrder({"id", "nome", "clienteDesde"})
@Entity
public class Cliente {

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private LocalDate clienteDesde;

    //construtor vazio
    public Cliente(){
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    //getters e setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public LocalDate getClienteDesde(){
        return clienteDesde;
    }
    public void setClienteDesde(LocalDate clienteDesde){
        this.clienteDesde = clienteDesde;
    }
}
