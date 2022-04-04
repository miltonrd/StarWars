package com.projetobb.StarWars.entidades;

import javax.persistence.*;
import java.util.Objects;
@Entity(name = "sexualidade")
public class Sexualidade {
    @Id
    @Column(name = "idsexualidade")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "sexo")
    private String sexo;

    public Sexualidade() {}

    public Sexualidade(Integer id,String sexo) {
        this.id = id;
        this.sexo = sexo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sexualidade)) return false;
        Sexualidade that = (Sexualidade) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
