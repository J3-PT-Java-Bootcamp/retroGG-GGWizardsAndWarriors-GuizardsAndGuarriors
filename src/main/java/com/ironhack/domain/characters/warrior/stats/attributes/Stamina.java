package com.ironhack.domain.characters.warrior.stats.attributes;

import com.ironhack.domain.characters.stats.IntRangeStat;

import java.util.Optional;

public class Stamina extends IntRangeStat {

    public Stamina(int value) {
        super(value);
    }

    public Stamina(Optional<String> value) {
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
