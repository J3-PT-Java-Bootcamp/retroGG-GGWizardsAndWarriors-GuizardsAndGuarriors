package com.ironhack.domain.characters.warrior;

import com.ironhack.domain.characters.Character;
import com.ironhack.domain.characters.behaviours.Attacker;
import com.ironhack.domain.characters.warrior.stats.WarriorBaseStats;
import com.ironhack.domain.characters.warrior.stats.WarriorCurrentStats;

public class Warrior extends Character implements Attacker {

    private WarriorBaseStats baseStats;
    private WarriorCurrentStats currentStats;

    private Warrior() {
        super();
    }
    private Warrior(int id, String name, WarriorBaseStats baseStats, WarriorCurrentStats currentStats, Boolean isAlive) {
        super(id, name, baseStats, currentStats, isAlive);
        this.baseStats = baseStats;
        this.currentStats = currentStats;
    }

    public static Warrior create(int id, String name, WarriorBaseStats baseStats, Boolean isAlive) {
        var currentStats = new WarriorCurrentStats(baseStats.getHp().getValue(), baseStats.getStamina().getValue(), baseStats.getStrength().getValue());
        return new Warrior(id, name, baseStats, currentStats, isAlive);
    }
    @Override
    public WarriorBaseStats getBaseStats() {
        return baseStats;
    }

    @Override
    public WarriorCurrentStats getCurrentStats() {
        return currentStats;
    }

    @Override
    public void attack(Character attacked) {
        int currentStamina = getCurrentStats().getStamina();
        int currentStrength = getCurrentStats().getStrength();
        if (currentStamina >= 5) {
            getCurrentStats().setStamina(currentStamina - 5);
            System.out.println("Heavy attack: Total damage is " + currentStrength);
        } else {
            int damage = currentStrength / 2;
            getCurrentStats().setStamina(currentStamina + 1);
            System.out.println("Weak attack: Total damage is " + damage);
        }
    }
}
