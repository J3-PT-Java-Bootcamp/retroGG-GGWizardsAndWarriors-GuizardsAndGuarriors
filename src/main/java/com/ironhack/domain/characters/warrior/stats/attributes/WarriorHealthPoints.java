package com.ironhack.domain.characters.warrior.stats.attributes;


import com.ironhack.domain.characters.stats.attributes.HealthPoints;

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
