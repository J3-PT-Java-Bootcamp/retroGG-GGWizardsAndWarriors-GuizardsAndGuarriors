package src.domain.characters.warrior.stats;

import src.domain.characters.stats.HealthPoints;

public class WarriorHealthPoints extends HealthPoints {

    public WarriorHealthPoints(int value) {
        super(value);
    }

    @Override
    public int getMaxValue() {
        return 200;
    }

    @Override
    public int getMinValue() {
        return 100;
    }

}
