package com.example.demo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Captura {

	@Id
	@Column(nullable=false)
	private Integer entrenador_id;
	
	
	
}
