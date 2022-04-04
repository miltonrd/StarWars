package com.projetobb.StarWars.servico;

import com.projetobb.StarWars.entidades.Filme;
import com.projetobb.StarWars.entidades.Personagem;
import com.projetobb.StarWars.repositorios.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository repoPersonagem;
    public List<Personagem> findAll() {
        return repoPersonagem.findAll();
    }
    public Personagem findById(Integer id) {
        Optional<Personagem> obj = repoPersonagem.findById(id);
        return obj.get();
    }

    public Personagem inserir(Personagem obj) {
        return repoPersonagem.save(obj);
    }

    public void delete(Integer id) {
        repoPersonagem.deleteById(id);
    }


}
