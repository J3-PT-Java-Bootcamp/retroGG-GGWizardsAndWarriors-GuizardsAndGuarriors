package com.ironhack.domain.characters.stats;

import com.ironhack.domain.characters.stats.attributes.HealthPoints;

public class CurrentBaseStats {
    private HealthPoints hp;

    public CurrentBaseStats(HealthPoints hp) {
        this.hp = hp;
    }

    public HealthPoints getHp() {
        return hp;
    }

    public void setHealthPoints(HealthPoints hp) {
        this.hp = hp;
    }
}
