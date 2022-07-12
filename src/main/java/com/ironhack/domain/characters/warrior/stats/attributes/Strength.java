package com.ironhack.domain.characters.warrior.stats.attributes;

import com.ironhack.domain.characters.stats.IntRangeStat;

import java.util.Optional;

public class Strength extends IntRangeStat {

    public Strength(int value) {
        super(value);
    }

    public Strength(Optional<String> value) {
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
