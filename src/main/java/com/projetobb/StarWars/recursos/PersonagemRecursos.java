package com.projetobb.StarWars.recursos;

import com.projetobb.StarWars.entidades.Filme;
import com.projetobb.StarWars.entidades.Personagem;
import com.projetobb.StarWars.servico.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/personagens")
public class PersonagemRecursos {

    @Autowired
    private PersonagemService service;

    @GetMapping
    public ResponseEntity<List<Personagem>> findAll() {
        List<Personagem> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Personagem> findById(@PathVariable Integer id) {
        Personagem obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Personagem> inserir(@RequestBody Personagem obj) {
        obj = service.inserir(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
