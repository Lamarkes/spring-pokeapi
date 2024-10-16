package tech.spring.pokeapi.entities.ability;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import tech.spring.pokeapi.entities.NamedAPIResource;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Ability {

    private boolean isHidden;
    private Integer slot;
    private NamedAPIResource ability;

    public Ability(boolean isHidden, Integer slot, NamedAPIResource ability) {
        this.isHidden = isHidden;
        this.slot = slot;
        this.ability = ability;
    }

    public Ability() {
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public NamedAPIResource getAbility() {
        return ability;
    }

    public void setAbility(NamedAPIResource ability) {
        this.ability = ability;
    }
}
