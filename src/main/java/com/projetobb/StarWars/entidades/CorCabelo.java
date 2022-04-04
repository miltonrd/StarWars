package com.projetobb.StarWars.entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "cabelo")
public class CorCabelo {
    @Id
    @Column(name = "idcabelo")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    public CorCabelo() {}

    public CorCabelo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CorCabelo)) return false;
        CorCabelo corCabelo = (CorCabelo) o;
        return Objects.equals(getId(), corCabelo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
