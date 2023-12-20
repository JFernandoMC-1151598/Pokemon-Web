package com.example.demo.entities;

import java.io.Serial;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.w3c.dom.Text;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Pokemon {

	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable=false)
	private Serial id;
	
	@Column(nullable=false, length=100)
	private String nombre;
	
	@Column(nullable=false)
	private Text descripcion;
	
	@Id
	@Column(nullable=false)
	private Integer tipo_pokemon;
	
	@Column(nullable=false)
	private Date fecha_dedscubrimienton;
	
	@Column(nullable=false)
	private Integer generacion;
	
	@Column(nullable=false, length=100)
	private String uuid;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "pokemons")
    private List<Entrenador> entrenadores = new ArrayList<>();
	
	public Pokemon() {
		
	}

	public Pokemon(Serial id, String nombre, Text descripcion, Integer tipo_pokemon, Date fecha_dedscubrimienton,
			Integer generacion, String uuid) {
		
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo_pokemon = tipo_pokemon;
		this.fecha_dedscubrimienton = fecha_dedscubrimienton;
		this.generacion = generacion;
		this.uuid = uuid;
	}
	
	public void addEntrenador(Entrenador entrenador) {
        entrenadores.add(entrenador);
        entrenador.getPokemons().add(this);
    }
}
