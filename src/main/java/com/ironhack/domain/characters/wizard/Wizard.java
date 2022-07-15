package com.ironhack.domain.characters.wizard;


import com.ironhack.domain.characters.Character;
import com.ironhack.domain.characters.wizard.stats.WizardBaseStats;
import com.ironhack.domain.characters.wizard.stats.WizardCurrentStats;

import java.util.UUID;

public class Wizard extends Character {

    private final int STAFF_DAMAGE = 2;
    private final int MANA_RECOVER = 1;
    private WizardBaseStats baseStats;
    private WizardCurrentStats currentStats;

    private Wizard() {
        super();
    }

    private Wizard(UUID id, String name, WizardBaseStats baseStats, WizardCurrentStats currentStats, Boolean isAlive) {
        super(id, name, baseStats, currentStats, isAlive);
        this.baseStats = baseStats;
        this.currentStats = currentStats;
    }

    public static Wizard create(UUID id, String name, WizardBaseStats baseStats) {
        var currentStats = new WizardCurrentStats(baseStats.getHp().getValue(), baseStats.getMana().getValue(), baseStats.getIntelligence().getValue());
        return new Wizard(id, name, baseStats, currentStats, true);
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
    public void attack(Character attacked) {
        int currentMana = this.currentStats.getMana();
        int currentIntelligence = this.currentStats.getIntelligence();
        if (currentMana >= 5) {
            attacked.decreaseHealthPoints(currentIntelligence);
            this.currentStats.setMana(currentMana - 5);
            System.out.println(getName() + " attacked with Fireball!! Total damage is " + currentIntelligence);
            System.out.println(getName() + " hp:" + getCurrentStats().getHp());
            System.out.println("---------------------------------------------------------------");
        } else {
            attacked.decreaseHealthPoints(STAFF_DAMAGE);
            this.currentStats.addMana(MANA_RECOVER);
            System.out.println(getName() + " attacked with Staff Hit!! Total damage is " + STAFF_DAMAGE);
            System.out.println(getName() + " hp:" + getCurrentStats().getHp());
            System.out.println("---------------------------------------------------------------");
        }
    }
}
