package com.projetobb.StarWars.entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "cores")
public class Cor {
    @Id
    @Column(name = "idcor")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "cor")
    private String cor;

    public Cor() {}

    public Cor(Integer id,String cor) {
        this.id = id;
        this.cor = cor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cor)) return false;
        Cor cor = (Cor) o;
        return Objects.equals(getId(), cor.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
