package tech.spring.pokeapi.entities.type;

import tech.spring.pokeapi.entities.NamedAPIResource;

public class Type {

    private Integer slot;

    private NamedAPIResource type;

    public Type(Integer slot, NamedAPIResource type) {
        this.slot = slot;
        this.type = type;
    }

    public Type() {
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public NamedAPIResource getType() {
        return type;
    }

    public void setType(NamedAPIResource type) {
        this.type = type;
    }
}
