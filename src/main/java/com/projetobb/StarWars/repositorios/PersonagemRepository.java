package com.projetobb.StarWars.repositorios;

import com.projetobb.StarWars.entidades.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonagemRepository extends JpaRepository<Personagem,Integer> {
    Optional<Personagem> findById(Integer id);
}
