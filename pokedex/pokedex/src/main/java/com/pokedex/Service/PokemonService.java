package com.pokedex.Service;


import com.pokedex.Model.Pokemon;
import com.pokedex.Repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    private PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public String addPokemon(Pokemon pokemon){
        return pokemonRepository.addPokemon(pokemon);

    }

    public List<Pokemon> getlista(){
        return pokemonRepository.getListaPokemon();
    }

    public String updatePokemon(String nome, Pokemon pokemon){
        return pokemonRepository.updatePokemon(nome , pokemon);
    }

    public String deletePokemon(String nome){
        return pokemonRepository.deletePokemon(nome);
    }

  }







