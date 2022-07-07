package com.ironhack.domain.characters.wizard.stats.attributes;


import com.ironhack.domain.characters.stats.attributes.HealthPoints;

public class WizardHealthPoints extends HealthPoints {

    public WizardHealthPoints(int value) {
        super(value);
    }

    @Override
    public int getMaxValue() {
        return 100;
    }

    @Override
    public int getMinValue() {
        return 50;
    }
}
