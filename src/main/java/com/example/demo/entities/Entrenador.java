package com.example.demo.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Entrenador implements Serializable{

	@Id
	@Column(nullable=false)
	private Serial id;
	
	@Column(nullable=false, length=50)
	private String nombre;
	
	@Column(nullable=false, length=50)
	private String apellido;
	
	@Column(nullable=false)
	private Date fecha_nacimiento;
	
	@Column(nullable=false)
	private Date fecha_vinculacion;
	
	@Column(nullable=false)
	private Integer pueblo_id;
	
	@Column(nullable=false, length=100)
	private String uuid;
	
	@ManyToMany
    private List<Pokemon> pokemons = new ArrayList<>();
	
	public Entrenador() {
		
	}

	public Entrenador(Serial id, String nombre, String apellido, Date fecha_nacimiento, Date fecha_vinculacion,
			Integer pueblo_id, String uuid, List<Pokemon> pokemons) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		this.fecha_vinculacion = fecha_vinculacion;
		this.pueblo_id = pueblo_id;
		this.uuid = uuid;
		this.pokemons = pokemons;
	}

	public Entrenador(Serial id, String nombre, String apellido, Date fecha_nacimiento, Date fecha_vinculacion,
			Integer pueblo_id, String uuid) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		this.fecha_vinculacion = fecha_vinculacion;
		this.pueblo_id = pueblo_id;
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "Entrenador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha_nacimiento="
				+ fecha_nacimiento + ", fecha_vinculacion=" + fecha_vinculacion + ", pueblo_id=" + pueblo_id + ", uuid="
				+ uuid + "]";
	}
	
	
}
