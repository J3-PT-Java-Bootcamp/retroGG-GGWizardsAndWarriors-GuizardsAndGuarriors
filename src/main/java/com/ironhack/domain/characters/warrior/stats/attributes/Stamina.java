package com.ironhack.domain.characters.warrior.stats.attributes;

import com.ironhack.domain.characters.stats.IntRangeStat;

import java.util.Optional;

public class Stamina extends IntRangeStat {

    public static final int MAX_VALUE = 50;
    public static final int MIN_VALUE = 10;

    public Stamina(int value) {
        super(value);
    }

    public Stamina(Optional<String> value) {
        super(value);
    }

    @Override
    public int getMaxValue() {
        return MAX_VALUE;
    }

    @Override
    public int getMinValue() {
        return MIN_VALUE;
    }

}
