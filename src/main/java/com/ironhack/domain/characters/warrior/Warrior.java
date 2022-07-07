package com.ironhack.domain.characters.warrior;

import com.ironhack.domain.characters.Character;
import com.ironhack.domain.characters.behaviours.Attacker;
import com.ironhack.domain.characters.warrior.stats.WarriorBaseStats;
import com.ironhack.domain.characters.warrior.stats.WarriorCurrentStats;
import com.ironhack.domain.characters.warrior.stats.attributes.Stamina;

public class Warrior extends Character implements Attacker {

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

    @Override
    public void attack() {
        int currentStamina = getCurrentStats().getStamina().getValue();
        int currentStrength = getCurrentStats().getStrength().getValue();
        if(currentStamina >= 5) {
            int damage = currentStrength;
            getCurrentStats().setStamina(new Stamina(currentStamina - 5));
            System.out.println("Heavy attack: Total damage is " + damage);
        } else{
            int damage = currentStrength/2;
            getCurrentStats().setStamina(new Stamina(currentStamina + 1));
            System.out.println("Weak attack: Total damage is " + damage);
        }
    }
}
