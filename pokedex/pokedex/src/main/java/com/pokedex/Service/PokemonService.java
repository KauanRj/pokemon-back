package com.pokedex.Service;


import com.pokedex.Model.Pokemon;
import com.pokedex.Repository.PokemonRepository;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    private PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public String HelloWorld(String nome, String tipo){
        return "Hello " + pokemonRepository.mostrarNome()  + "\n" + "Tipo: " + pokemonRepository.mostrarTipo();
    }


    public String ByeWorld(String nome, String tipo){
        return "Bye " +pokemonRepository.mostrarNome() + "\n" + "Tipo: " + pokemonRepository.mostrarTipo();
    }

    public Pokemon mostrarPokemon(){
       return pokemonRepository.pegarPokemon();

    }



  }







