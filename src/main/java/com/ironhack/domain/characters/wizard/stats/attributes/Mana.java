package com.ironhack.domain.characters.wizard.stats.attributes;

import src.domain.characters.stats.IntRangeStat;

public class Mana extends IntRangeStat {
    public Mana(int value) {
        super(value);
    }

    @Override
    public int getMaxValue() {
        return 50;
    }

    @Override
    public int getMinValue() {
        return 10;
    }
}
