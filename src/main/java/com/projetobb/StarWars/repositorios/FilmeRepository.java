package com.projetobb.StarWars.repositorios;

import com.projetobb.StarWars.entidades.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FilmeRepository extends JpaRepository<Filme,Integer> {
    Optional<Filme> findById(Integer id);
}
