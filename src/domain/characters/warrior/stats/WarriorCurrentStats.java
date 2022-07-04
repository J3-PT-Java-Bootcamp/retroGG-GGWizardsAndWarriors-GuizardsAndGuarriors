package src.domain.characters.warrior.stats;

import src.domain.characters.stats.CurrentBaseStats;

public class WarriorCurrentStats extends CurrentBaseStats {

    private Stamina stamina;
    private Strength strength;

    public WarriorCurrentStats(WarriorHealthPoints hp, Stamina stamina, Strength strength) {
        super(hp);
        this.strength = strength;
        this.stamina = stamina;
    }

    public Stamina getStamina() {
        return this.stamina;
    }

    public Strength getStrength() {
        return this.strength;
    }

    public void setStamina(Stamina stamina) {
        this.stamina = stamina;
    }

    public void setStrength(Strength strength) {
        this.strength = strength;
    }
}
