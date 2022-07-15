package com.ironhack.domain.characters.warrior;

import com.ironhack.domain.characters.Character;
import com.ironhack.domain.characters.behaviours.Attacker;
import com.ironhack.domain.characters.warrior.stats.WarriorBaseStats;
import com.ironhack.domain.characters.warrior.stats.WarriorCurrentStats;

import java.util.UUID;

public class Warrior extends Character implements Attacker {

    private WarriorBaseStats baseStats;
    private WarriorCurrentStats currentStats;

    private Warrior() {
        super();
    }

    private Warrior(UUID id, String name, WarriorBaseStats baseStats, WarriorCurrentStats currentStats, Boolean isAlive) {
        super(id, name, baseStats, currentStats, isAlive);
        this.baseStats = baseStats;
        this.currentStats = currentStats;
    }

    public static Warrior create(UUID id, String name, WarriorBaseStats baseStats) {
        var currentStats = new WarriorCurrentStats(baseStats.getHp().getValue(), baseStats.getStamina().getValue(), baseStats.getStrength().getValue());
        return new Warrior(id, name, baseStats, currentStats, true);
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
            attacked.decreaseHealthPoints(currentStrength);
            getCurrentStats().setStamina(currentStamina - 5);
            System.out.println(getName() + " attacked with Heavy attack!! Total damage is " + currentStrength);
            System.out.println(getName() + " hp:" + getCurrentStats().getHp());
            System.out.println("---------------------------------------------------------------");
        } else {
            int damage = currentStrength / 2;
            attacked.decreaseHealthPoints(damage);
            getCurrentStats().setStamina(currentStamina + 1);
            System.out.println(getName() + " attacked with Weak attack!! Total damage is " + damage);
            System.out.println(getName() + " hp:" + getCurrentStats().getHp());
            System.out.println("---------------------------------------------------------------");
        }
    }
}
