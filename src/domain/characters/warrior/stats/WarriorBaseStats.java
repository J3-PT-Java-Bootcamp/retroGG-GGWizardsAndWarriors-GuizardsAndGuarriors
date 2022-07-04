package src.domain.characters.warrior.stats;

import src.domain.characters.stats.BaseStats;
import src.domain.characters.warrior.stats.attributes.Stamina;
import src.domain.characters.warrior.stats.attributes.Strength;
import src.domain.characters.warrior.stats.attributes.WarriorHealthPoints;

public class WarriorBaseStats extends BaseStats {

    private final Stamina stamina;
    private final Strength strength;

    public WarriorBaseStats(WarriorHealthPoints hp, Stamina stamina, Strength strength) {
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