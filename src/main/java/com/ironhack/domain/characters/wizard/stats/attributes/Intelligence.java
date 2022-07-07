package com.ironhack.domain.characters.wizard.stats.attributes;

import src.domain.characters.stats.IntRangeStat;

public class Intelligence extends IntRangeStat {
    public Intelligence(int value) {
        super(value);
    }

    @Override
    public int getMaxValue() {
        return 50;
    }

    @Override
    public int getMinValue() {
        return 1;
    }
}
