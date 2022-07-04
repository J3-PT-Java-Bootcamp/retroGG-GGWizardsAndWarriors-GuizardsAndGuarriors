package src.domain.characters.warrior.stats;

import src.domain.characters.stats.IntRangeStat;

public class Strength extends IntRangeStat {

    public Strength(int value) {
        super(value);
    }

    @Override
    public int getMaxValue() {
        return 10;
    }

    @Override
    public int getMinValue() {
        return 1;
    }
}
