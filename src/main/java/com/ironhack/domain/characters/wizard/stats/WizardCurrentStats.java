package com.ironhack.domain.characters.wizard.stats;

import com.ironhack.domain.characters.stats.CurrentBaseStats;

public class WizardCurrentStats extends CurrentBaseStats {

    private Integer mana;
    private Integer intelligence;

    public WizardCurrentStats(Integer hp, Integer mana, Integer intelligence) {
        super(hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public Integer getMana() {
        return this.mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Integer getIntelligence() {
        return this.intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }
}
