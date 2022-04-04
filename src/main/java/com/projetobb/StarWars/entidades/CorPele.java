package com.projetobb.StarWars.entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "pele")
public class CorPele {
    @Id
    @Column(name = "idpele")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    public CorPele() {}

    public CorPele(Integer id) {
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
        if (!(o instanceof CorPele)) return false;
        CorPele corPele = (CorPele) o;
        return Objects.equals(getId(), corPele.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}


