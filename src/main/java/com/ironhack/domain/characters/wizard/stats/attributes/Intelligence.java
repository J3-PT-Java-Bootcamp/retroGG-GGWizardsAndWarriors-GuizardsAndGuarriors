package com.ironhack.domain.characters.wizard.stats.attributes;

import com.ironhack.domain.characters.stats.IntRangeStat;

import java.util.Optional;

public class Intelligence extends IntRangeStat {
    public Intelligence(int value) {
        super(value);
    }

    public Intelligence(Optional<String> value) {
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
