package src.domain.characters.wizard.stats;

import src.domain.characters.stats.BaseStats;

public class WizardStats extends BaseStats {

    private final Mana mana;
    private final Intelligence intelligence;

    public WizardStats(WizardHealthPoints hp, Mana mana, Intelligence intelligence) {
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
