package com.example.demo.repositories;

import java.io.Serial;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Serial> {

	
}
