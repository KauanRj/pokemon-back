package com.pokedex.Controller;

import com.pokedex.Model.Pokemon;
import com.pokedex.Repository.PokemonRepository;
import com.pokedex.Service.PokemonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("")
    public List<Pokemon> mostar(){

        List<Pokemon> picachu = pokemonService.mostrarPokemon();

        return picachu;
    }

    @PostMapping ("")
    public void  addPokemon( @RequestBody Pokemon pokemon){

        pokemonService.addPokemon(pokemon);

    }



}