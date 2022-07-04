package src.domain.characters.wizard.stats;

import src.domain.characters.stats.CurrentBaseStats;

public class WizardCurrentStats extends CurrentBaseStats {

    private Mana mana;
    private Intelligence intelligence;

    public WizardCurrentStats(WizardHealthPoints hp, Mana mana, Intelligence intelligence) {
        super(hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public Mana getMana() {
        return this.mana;
    }

    public void setMana(Mana mana) {
        this.mana = mana;
    }

    public Intelligence getIntelligence() {
        return this.intelligence;
    }

    public void setIntelligence(Intelligence intelligence) {
        this.intelligence = intelligence;
    }
}
