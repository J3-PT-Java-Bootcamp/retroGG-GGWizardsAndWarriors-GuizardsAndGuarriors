package com.ironhack.domain.characters;

import com.ironhack.domain.characters.behaviours.Attacker;
import com.ironhack.domain.characters.stats.BaseStats;
import com.ironhack.domain.characters.stats.CurrentBaseStats;


import java.util.Objects;
import java.util.UUID;

public abstract class Character implements Attacker {
    private UUID id;
    private String name;
    private BaseStats baseStats;
    private CurrentBaseStats currentStats;
    private Boolean isAlive;

    public Character(UUID id, String name, BaseStats baseStats, CurrentBaseStats currentStats, Boolean isAlive) {
        this.id = id;
        this.name = name;
        this.baseStats = baseStats;
        this.isAlive = isAlive;
        this.currentStats = currentStats;
    }

    protected Character() {
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isAlive() {
        return isAlive;
    }

    public void die() {
        isAlive = false;
    }

    public BaseStats getBaseStats() {
        return this.baseStats;
    }

    public CurrentBaseStats getCurrentStats() {
        return this.currentStats;
    }

    public void decreaseHealthPoints(Integer quantity) {
        this.currentStats.setHealthPoints(quantity);
        if (this.currentStats.getHp() <= 0) {
            this.die();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(id, character.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("""
                =================
                %s - %s
                =================
                Base stats
                %s
                """, this.id, this.name, this.baseStats);
    }
}