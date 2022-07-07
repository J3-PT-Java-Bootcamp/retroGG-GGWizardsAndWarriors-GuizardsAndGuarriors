package com.ironhack.domain.characters.wizard.stats;

import src.domain.characters.stats.BaseStats;
import src.domain.characters.wizard.stats.attributes.Intelligence;
import src.domain.characters.wizard.stats.attributes.Mana;
import src.domain.characters.wizard.stats.attributes.WizardHealthPoints;

public class WizardBaseStats extends BaseStats {

    protected Mana mana;
    protected Intelligence intelligence;

    public WizardBaseStats(WizardHealthPoints hp, Mana mana, Intelligence intelligence) {
        super(hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public Mana getMana() {
        return mana;
    }

    public Intelligence getIntelligence() {
        return intelligence;
    }
}
