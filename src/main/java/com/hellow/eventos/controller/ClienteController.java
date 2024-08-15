package com.hellow.eventos.controller;

import com.hellow.eventos.classes.cliente.Cliente;
import com.hellow.eventos.classes.cliente.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")

public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping(name="/todos")
    public List<Cliente> getTodosClientes(){
        return clienteRepository.findAll();
    }

    @PostMapping(name="/add")
    public Cliente addCliente(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
        return cliente;
    }

}
