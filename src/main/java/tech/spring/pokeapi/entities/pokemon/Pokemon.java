package tech.spring.pokeapi.entities.pokemon;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import tech.spring.pokeapi.entities.ability.Ability;
import tech.spring.pokeapi.entities.type.Type;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Pokemon {

    private Integer id;
    private String name;
    private Integer baseExperience;
    private Integer weight;
    private List<Ability> abilities;
    private List<Type> types;

    public Pokemon(Integer id, String name, Integer baseExperience, Integer weight, List<Ability> abilities, List<Type> types) {
        this.id = id;
        this.name = name;
        this.baseExperience = baseExperience;
        this.weight = weight;
        this.abilities = abilities;
        this.types = types;
    }

    public Pokemon() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
