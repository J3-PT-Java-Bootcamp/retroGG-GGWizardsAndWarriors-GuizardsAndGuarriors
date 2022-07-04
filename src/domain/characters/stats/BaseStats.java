package src.domain.characters.stats;

import src.domain.characters.stats.attributes.HealthPoints;

public class BaseStats {
    private final HealthPoints hp;

    public BaseStats(HealthPoints hp) {
        this.hp = hp;
    }
}