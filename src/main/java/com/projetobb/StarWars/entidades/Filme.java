package com.projetobb.StarWars.entidades;

import javax.persistence.*;
import java.util.Objects;
@Entity(name = "filmes")
public class Filme {
    @Id
    @Column(name = "idfilmes")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "episodio")
    private String episodio;
    @Column(name = "sinopse")
    private String sinopse;
    @Column(name = "diretor")
    private String diretor;
    @Column(name = "produtor")
    private String produtor;
    @Column(name = "datalancamento")
    private String datalancamento;
    @Column(name = "criado")
    private String criado;
    @Column(name = "editado")
    private String editado;

    public Filme() {}

    public Filme(Integer id,String titulo,String episodio,String sinopse,String diretor, String produtor,
                 String datalancamento,String criado,String editado) {
        this.id = id;
        this.titulo =titulo;
        this.episodio = episodio;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.produtor = produtor;
        this.datalancamento = datalancamento;
        this.criado = criado;
        this.editado = editado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEpisodio() {
        return episodio;
    }

    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getDatalancamento() {
        return datalancamento;
    }

    public void setDatalancamento(String datalancamento) {
        this.datalancamento = datalancamento;
    }

    public String getCriado() {
        return criado;
    }

    public void setCriado(String criado) {
        this.criado = criado;
    }

    public String getEditado() {
        return editado;
    }

    public void setEditado(String editado) {
        this.editado = editado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Filme)) return false;
        Filme filme = (Filme) o;
        return Objects.equals(getId(), filme.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
