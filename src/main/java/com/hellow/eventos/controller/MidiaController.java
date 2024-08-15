package com.hellow.eventos.controller;

import com.hellow.eventos.classes.midia.Midia;
import com.hellow.eventos.classes.midia.MidiaRepository;
import com.hellow.eventos.classes.midia.Midia;
import com.hellow.eventos.classes.midia.MidiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/midia")

public class MidiaController {
    @Autowired
    private MidiaRepository midiaRepository;

    @GetMapping("/todos")
    public List<Midia> getAllMidias(){
        return this.midiaRepository.findAll();
    }

    @PostMapping("/add")
    public Midia addMidia(@RequestBody Midia midia){
        this.midiaRepository.save(midia);
        return midia;
    }

}

