package com.pokedex.Repository;

import com.pokedex.Model.Pokemon;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PokemonRepository {



    private List<Pokemon> listaPokemon;

    public PokemonRepository(List<Pokemon> listaPokemon) {
        this.listaPokemon = listaPokemon;
    }

    public String addPokemon(Pokemon pokemon){
        this.listaPokemon.add(pokemon);

        return "Deu certo!";
    }

    public List<Pokemon> getListaPokemon() {
        return listaPokemon;
    }
}
