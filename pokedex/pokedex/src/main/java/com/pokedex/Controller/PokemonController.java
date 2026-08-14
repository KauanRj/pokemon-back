package com.pokedex.Controller;

import com.pokedex.Model.Pokemon;
import com.pokedex.Service.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private PokemonService pokemonService;


    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/oi/{nome}")
    public String HelloWorld(@PathVariable String nome, String tipo){

        String saudacao = pokemonService.HelloWorld(nome, tipo);

        return saudacao;
    }

    @GetMapping("/tchau/{nome}")
    public String ByeWorld(@PathVariable String nome, String tipo){
        String tchauzao = pokemonService.ByeWorld(nome, tipo);


        return tchauzao;

    }

    @GetMapping("/pokemon")
    public Pokemon mostar(){

        Pokemon picachu = pokemonService.mostrarPokemon();

        return picachu;


    }


}