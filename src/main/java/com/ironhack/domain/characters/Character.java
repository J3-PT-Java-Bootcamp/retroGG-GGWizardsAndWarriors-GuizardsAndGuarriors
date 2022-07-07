package com.ironhack.domain.characters;

import com.ironhack.domain.characters.stats.BaseStats;
import com.ironhack.domain.characters.stats.CurrentBaseStats;

public abstract class Character {
    int id;
    String name;
    private final BaseStats baseStats;
    private final CurrentBaseStats currentStats;
    Boolean isAlive;

    public Character(int id, String name, BaseStats baseStats, CurrentBaseStats currentStats, Boolean isAlive) {
        this.id = id;
        this.name = name;
        this.baseStats = baseStats;
        this.isAlive = isAlive;
        this.currentStats = currentStats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public BaseStats getBaseStats() {
        return this.baseStats;
    }

    public CurrentBaseStats getCurrentStats() {
        return this.currentStats;
    }
}
