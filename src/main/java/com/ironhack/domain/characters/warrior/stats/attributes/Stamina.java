package com.ironhack.domain.characters.warrior.stats.attributes;

import src.domain.characters.stats.IntRangeStat;

public class Stamina extends IntRangeStat {

    public Stamina(int value) {
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
