package com.ironhack.domain.characters.stats;

public class CurrentBaseStats {
    private Integer hp;

    public CurrentBaseStats(Integer hp) {
        this.hp = hp;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHealthPoints(Integer hp) {
        this.hp = hp;
    }
}
