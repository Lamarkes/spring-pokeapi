package tech.spring.pokeapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.spring.pokeapi.client.PokemonClient;
import tech.spring.pokeapi.entities.pokemon.Pokemon;

@RestController
@RequestMapping("/pokemon/v1/")
public class PokemonController {


    private PokemonClient pokemonClient;


    public PokemonController(PokemonClient pokemonClient) {
        this.pokemonClient = pokemonClient;
    }


    @GetMapping("name/{name}")
    public ResponseEntity<Pokemon> getPokemon(@PathVariable String name){

        String nameLowerCase = name.toLowerCase();

        var response = pokemonClient.getPokemon(nameLowerCase);

        return ResponseEntity.ok().body(response);
    }

    @GetMapping("id/{id}")
    public ResponseEntity<Pokemon> getPokemonById(@PathVariable Integer id){

        var response = pokemonClient.getPokemonById(id);

        return ResponseEntity.ok().body(response);
    }


}
