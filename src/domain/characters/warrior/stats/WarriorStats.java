package src.domain.characters.warrior.stats;

import src.domain.characters.stats.BaseStats;

public class WarriorStats extends BaseStats {

    private final Stamina stamina;
    private final Strength strength;

    public WarriorStats(WarriorHealthPoints hp, Stamina stamina, Strength strength) {
        super(hp);
        this.stamina = stamina;
        this.strength = strength;
    }

    public Stamina getStamina() {
        return stamina;
    }

    public Strength getStrength() {
        return strength;
    }
}