package com.pokedex.Repository;

import com.pokedex.Model.Pokemon;
import org.springframework.stereotype.Repository;

@Repository
public class PokemonRepository {

    private String nome;
    private String tipo;




    public PokemonRepository() {
        this.nome = "Marcos kralho";
        this.tipo = "Cafetão";
    }

    public String mostrarNome(){
        return nome;
    }

    public String mostrarTipo(){
        return tipo;
    }

    public Pokemon pegarPokemon(){
        Pokemon pikachu = new Pokemon("Pikachu","Eletrico");

        return pikachu;
    }

}
