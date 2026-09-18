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

    public String updatePokemon(String nome, Pokemon pokemonUpdate){
        for (Pokemon pokemon: listaPokemon){
            if (pokemon.getNome().equalsIgnoreCase(nome)) {

                // Opção 1: Atualiza os dados do objeto existente (Recomendado)
                pokemon.setNome(pokemonUpdate.getNome());
                pokemon.setTipo(pokemonUpdate.getTipo());

                return "Pokémon atualizado com sucesso!";
            }
        }
        return "Pokémon não encontrado.";

    }


    public String deletePokemon(String nome){
        for (Pokemon pokemon: listaPokemon){
            if (pokemon.getNome().equalsIgnoreCase(nome)) {

                // Opção 1: Atualiza os dados do objeto existente (Recomendado)
                listaPokemon.remove(pokemon);


                return "Pokémon deletado com sucesso!";
            }
        }
        return "Pokémon não encontrado.";

    }

}
