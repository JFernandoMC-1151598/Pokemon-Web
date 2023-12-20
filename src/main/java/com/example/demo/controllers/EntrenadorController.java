package com.example.demo.controllers;

import java.io.Serial;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Entrenador;
import com.example.demo.repositories.EntrenadorRepository;
	
	@RestController
	@RequestMapping("/entrenadores")
	public class EntrenadorController {

		@Autowired
		EntrenadorRepository entrenadorRepository;

		@GetMapping
		public List<Entrenador> getEntrenadorAll() {

			List<Entrenador> entrenador = entrenadorRepository.findAll();
			return entrenador;
		}

		@GetMapping("/{uuid}/pokemons")
		public Entrenador getpokemonsByEntrenador(@PathVariable Serial id) {

			Optional<Entrenador> entrenador = entrenadorRepository.findById(id);
			if (entrenador.isEmpty()) {
				return null;
			}
			return entrenador.get();
		}
		
		@PostMapping
		public Entrenador createEntrenador(@RequestBody Entrenador entrenador) {

			entrenadorRepository.save(entrenador);
			return entrenador;
		}
}
