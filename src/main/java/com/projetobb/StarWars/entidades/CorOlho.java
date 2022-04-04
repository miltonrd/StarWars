package com.projetobb.StarWars.entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "olho")
public class CorOlho {
    @Id
    @Column(name = "id_olho")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    public CorOlho() {
    }

    public CorOlho(Integer id) {
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
        if (!(o instanceof CorOlho)) return false;
        CorOlho corOlho = (CorOlho) o;
        return Objects.equals(getId(), corOlho.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
