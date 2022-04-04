package com.projetobb.StarWars.entidades;

import java.util.Objects;
import javax.persistence.*;

@Entity(name ="personagem")
public class Personagem  {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "altura")
	private Double altura;
	@Column(name = "peso")
	private Double peso;
	@Column(name = "birth_year")
	private String birth_year;
	@Column(name = "criado")
	private String criado;
	@Column(name = "editado")
	private String editado;

	@ManyToOne
	@JoinColumn(name = "idespecie")
	private Especie especie;


	public Personagem() {}


	public Personagem(Integer id, String nome, Double altura, Double peso, String birth_year, String criado,
			String editado) {


		this.id = id;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.birth_year = birth_year;
		this.criado = criado;
		this.editado = editado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
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
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personagem other = (Personagem) obj;
		return id == other.id;
	}



}
