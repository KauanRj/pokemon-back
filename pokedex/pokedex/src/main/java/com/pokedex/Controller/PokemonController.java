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




    @PostMapping ("/add")
    public String  addPokemon( @RequestBody Pokemon pokemon){

        return pokemonService.addPokemon(pokemon);

    }

    @GetMapping("/lista")
    public List<Pokemon> getLista(){
        return pokemonService.getlista();
    }



}