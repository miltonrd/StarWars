package com.projetobb.StarWars.servico;

import com.projetobb.StarWars.entidades.Filme;
import com.projetobb.StarWars.repositorios.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repoFilme;
    public List<Filme> findAll() {
        return repoFilme.findAll();
    }
    public Filme findById(Integer id) {
        Optional<Filme> obj = repoFilme.findById(id);
        return obj.get();
    }

        public Filme inserir(Filme obj) {
        return repoFilme.save(obj);
        }

        public void delete(Integer id) {
        repoFilme.deleteById(id);
        }

        public Filme atualiza(Integer id,Filme obj) {
        Filme filme = repoFilme.getOne(id);
        updateData(filme,obj);
        return repoFilme.save(filme);
        }

    private void updateData(Filme filme, Filme obj) {
        filme.setTitulo(obj.getTitulo());
        filme.setEpisodio(obj.getEpisodio());
        filme.setSinopse(obj.getSinopse());
        filme.setDiretor(obj.getDiretor());
        filme.setProdutor(obj.getProdutor());
        filme.setDatalancamento(obj.getDatalancamento());
        filme.setCriado(obj.getCriado());
        filme.setEditado(obj.getEditado());
    }

}
