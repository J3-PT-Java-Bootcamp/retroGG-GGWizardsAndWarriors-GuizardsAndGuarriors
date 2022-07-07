package com.ironhack.domain.characters.wizard;


import com.ironhack.domain.characters.Character;
import com.ironhack.domain.characters.wizard.stats.WizardBaseStats;
import com.ironhack.domain.characters.wizard.stats.WizardCurrentStats;

public class Wizard extends Character {

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
}
