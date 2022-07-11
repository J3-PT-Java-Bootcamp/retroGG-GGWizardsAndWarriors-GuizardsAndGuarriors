package com.ironhack.domain.characters.warrior.stats;


import com.ironhack.domain.characters.stats.BaseStats;
import com.ironhack.domain.characters.warrior.stats.attributes.Stamina;
import com.ironhack.domain.characters.warrior.stats.attributes.Strength;
import com.ironhack.domain.characters.warrior.stats.attributes.WarriorHealthPoints;

public class WarriorBaseStats extends BaseStats {

    private final Stamina stamina;
    private final Strength strength;

    public WarriorBaseStats(WarriorHealthPoints hp, Stamina stamina, Strength strength) {
        super(hp);
        this.stamina = stamina;
        this.strength = strength;
    }

    public Stamina getStamina() {
        return stamina;
    }

    public Strength getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + """
                Stamina= %d
                Strength= %d
                """, stamina.getValue(), strength.getValue());
    }
}