package com.ironhack.domain.characters.warrior.stats;

import com.ironhack.domain.characters.stats.CurrentBaseStats;

public class WarriorCurrentStats extends CurrentBaseStats {

    private Integer stamina;
    private Integer strength;

    public WarriorCurrentStats(Integer hp, Integer stamina, Integer strength) {
        super(hp);
        this.strength = strength;
        this.stamina = stamina;
    }

    public Integer getStamina() {
        return this.stamina;
    }

    public Integer getStrength() {
        return this.strength;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }
}
