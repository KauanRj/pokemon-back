package com.pokedex.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @GetMapping("/oi/{nome}")
    public String HelloWorld(@PathVariable String nome){
        return "Hello " + nome;
    }

    @GetMapping("/tchau/{nome}")
    public String ByeWorld(@PathVariable String nome){
        return "Bye " + nome;
    }

}