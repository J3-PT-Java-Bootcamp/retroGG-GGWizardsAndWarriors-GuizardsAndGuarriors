package com.ironhack.domain.characters.wizard;


import com.ironhack.domain.characters.Character;
import com.ironhack.domain.characters.behaviours.Attacker;
import com.ironhack.domain.characters.wizard.stats.WizardBaseStats;
import com.ironhack.domain.characters.wizard.stats.WizardCurrentStats;

public class Wizard extends Character implements Attacker {

    private final WizardBaseStats baseStats;
    private final WizardCurrentStats currentStats;

    public Wizard(int id, String name, WizardBaseStats baseStats, WizardCurrentStats currentStats, Boolean isAlive) {
        super(id, name, baseStats, currentStats, isAlive);
        this.baseStats = baseStats;
        this.currentStats = currentStats;
    }

    @Override
    public WizardBaseStats getBaseStats() {
        return baseStats;
    }

    @Override
    public WizardCurrentStats getCurrentStats() {
        return currentStats;
    }

    @Override
    public void attack() {
        int currentMana = getCurrentStats().getMana();
        int currentIntelligence = getCurrentStats().getIntelligence();
        if (currentMana >= 5) {
            getCurrentStats().setMana(currentMana - 5);
            ;
            System.out.println("Fireball: Total damage is " + currentIntelligence);
        } else {
            int damage = 2;
            getCurrentStats().setMana(currentMana + 1);
            System.out.println("Staff Hit: Total damage is " + damage);
        }

    }
}
