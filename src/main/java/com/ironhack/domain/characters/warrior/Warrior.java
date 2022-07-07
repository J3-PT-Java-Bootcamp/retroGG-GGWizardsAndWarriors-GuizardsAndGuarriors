package com.ironhack.domain.characters.warrior;

import com.ironhack.domain.characters.Character;
import com.ironhack.domain.characters.warrior.stats.WarriorBaseStats;
import com.ironhack.domain.characters.warrior.stats.WarriorCurrentStats;

public class Warrior extends Character {

    private final WarriorBaseStats baseStats;
    private final WarriorCurrentStats currentStats;

    public Warrior(int id, String name, WarriorBaseStats baseStats, WarriorCurrentStats currentStats, Boolean isAlive) {
        super(id, name, baseStats, currentStats, isAlive);
        this.baseStats = baseStats;
        this.currentStats = currentStats;
    }

    @Override
    public WarriorBaseStats getBaseStats() {
        return baseStats;
    }

    @Override
    public WarriorCurrentStats getCurrentStats() {
        return currentStats;
    }
}
