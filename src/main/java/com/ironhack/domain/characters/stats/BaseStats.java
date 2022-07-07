package com.ironhack.domain.characters.stats;


import com.ironhack.domain.characters.stats.attributes.HealthPoints;

public class BaseStats {
    private final HealthPoints hp;

    public BaseStats(HealthPoints hp) {
        this.hp = hp;
    }
}