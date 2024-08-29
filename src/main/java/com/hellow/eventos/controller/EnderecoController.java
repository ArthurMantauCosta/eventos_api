package com.hellow.eventos.controller;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.endereco.EnderecoRepository;
import com.hellow.eventos.classes.tipo.Tipo;
import com.hellow.eventos.classes.tipo.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private TipoRepository tipoRepository;

    @GetMapping("todos")
    public List<Endereco> getTodosEnderecos(){
        return enderecoRepository.findAll();
    }

    @PostMapping("add")
    public Endereco addEndereco(@RequestBody Endereco endereco){
        Tipo tipo = tipoRepository.findById(endereco.getTipo().getTipo_id()).orElseThrow(()->new RuntimeException("Tipo não existe"));
        enderecoRepository.save(endereco);
        return endereco;
    }

}
