package com.projetobb.StarWars.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity(name = "especie")
public class Especie{
    @Id
    @Column(name = "idespecie")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "linhagem")
    private String especie;

    @JsonIgnore
    @OneToMany(mappedBy = "especie")
    private List<Personagem> personagens = new ArrayList<>();

    public Especie() {}

    public Especie(Integer id, String especie, Personagem teste) {
        this.id = id;
        this.especie = especie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Especie)) return false;
        Especie especie = (Especie) o;
        return getId() == especie.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


}
