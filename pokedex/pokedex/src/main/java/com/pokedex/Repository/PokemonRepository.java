package com.pokedex.Repository;

import com.pokedex.Model.Pokemon;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PokemonRepository {

    private String nome;
    private String tipo;

    private List<Pokemon> listaPokemon;

    public PokemonRepository(String nome, List<Pokemon> listaPokemon, String tipo) {
        this.nome = nome;
        this.listaPokemon = listaPokemon;
        this.tipo = tipo;
    }

    public PokemonRepository() {
        this.nome = "kauan";
        this.tipo = "Casado";
    }

    public String mostrarNome(){
        return nome;
    }

    public String mostrarTipo(){
        return tipo;
    }

    public List<Pokemon> pegarPokemon(){
        Pokemon pikachu = new Pokemon("Pikachu","Eletrico");

        return this.pokemonList;
    }

    List<Pokemon> pokemonList = new ArrayList<>();

    public void addPokemon(Pokemon pokemon){
        pokemonList.add(pokemon);
    }





}
