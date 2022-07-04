package src.domain.characters.stats.attributes;

import src.domain.characters.stats.IntRangeStat;

public abstract class HealthPoints extends IntRangeStat {
    public HealthPoints(int value) {
        super(value);
    }
}