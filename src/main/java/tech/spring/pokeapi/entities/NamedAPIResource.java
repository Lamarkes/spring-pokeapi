package tech.spring.pokeapi.entities;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class NamedAPIResource {

    private String name;

    public NamedAPIResource(String name) {
        this.name = name;
    }

    public NamedAPIResource() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
