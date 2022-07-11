package com.ironhack.domain.characters.stats;


import com.ironhack.domain.characters.stats.attributes.HealthPoints;

public class BaseStats {
    private final HealthPoints hp;

    public BaseStats(HealthPoints hp) {
        this.hp = hp;
    }

    public HealthPoints getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return String.format("HP= %d\n", hp.getValue());
    }
}