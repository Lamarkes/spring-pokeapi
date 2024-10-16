package tech.spring.pokeapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tech.spring.pokeapi.entities.pokemon.Pokemon;

@FeignClient(
        name = "PokemonClient",
        url = "https://pokeapi.co/api/v2/pokemon"
)
public interface PokemonClient {


    @GetMapping("/{name}")
    Pokemon getPokemon(@PathVariable(value = "name") String name);

    @GetMapping("/{id}")
    Pokemon getPokemonById(@PathVariable(value = "id") Integer id);

}
