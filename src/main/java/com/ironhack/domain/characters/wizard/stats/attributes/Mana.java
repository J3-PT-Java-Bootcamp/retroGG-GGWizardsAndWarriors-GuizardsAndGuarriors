package com.ironhack.domain.characters.wizard.stats.attributes;

import com.ironhack.domain.characters.stats.IntRangeStat;

import java.util.Optional;

public class Mana extends IntRangeStat {
    public Mana(int value) {
        super(value);
    }

    public Mana(Optional<String> value) {
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
