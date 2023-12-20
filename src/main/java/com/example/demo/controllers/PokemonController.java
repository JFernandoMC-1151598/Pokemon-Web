package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Pokemon;
import com.example.demo.repositories.PokemonRepository;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

	@Autowired
	PokemonRepository pokemonRepository;

	@GetMapping
	public List<Pokemon> getPokemonsAll() {

		List<Pokemon> pokemon = pokemonRepository.findAll();
		return pokemon;
	}

	@GetMapping("/{tipo}")
	public Pokemon getPokemonBytipo(@PathVariable Integer tipo_pokemon) {

		Optional<Pokemon> pokemon = pokemonRepository.findById(tipo_pokemon);
		if (pokemon.isEmpty()) {
			return null;
		}
		return pokemon.get();
	}

	@PostMapping
	public Pokemon createPokemon(@RequestBody Pokemon pokemon) {

		pokemonRepository.save(pokemon);
		return pokemon;
	}

}
