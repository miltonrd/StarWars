package com.projetobb.StarWars.recursos;

import com.projetobb.StarWars.entidades.Filme;
import com.projetobb.StarWars.servico.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/filmes")
public class FilmeRecursos {

    @Autowired
    private FilmeService service;

    @GetMapping
    public ResponseEntity<List<Filme>> findAll() {
        List<Filme> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Filme> findById(@PathVariable Integer id) {
        Filme obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Filme> inserir(@RequestBody Filme obj) {
            obj = service.inserir(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
            return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Filme> atualiza(@PathVariable Integer id,@RequestBody Filme obj) {
        obj = service.atualiza(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
