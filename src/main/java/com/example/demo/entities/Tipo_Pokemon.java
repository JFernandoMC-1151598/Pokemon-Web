package com.example.demo.entities;

import java.io.Serial;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Tipo_Pokemon {

	@Id
	@Column(nullable=false)
	private Serial id;
	
	@Column(nullable=false, length=100)
	private String descripcion;
	
	@Column(nullable=false, length=100)
	private String uuid;
	
}
