package com.ironhack.domain.characters.wizard.stats.attributes;


import com.ironhack.domain.characters.stats.attributes.HealthPoints;

import java.util.Optional;

public class WizardHealthPoints extends HealthPoints {

    public WizardHealthPoints(int value) {
        super(value);
    }

    public WizardHealthPoints(Optional<String> value) {
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
