package com.ironhack.domain.characters.stats.attributes;

import com.ironhack.domain.characters.stats.IntRangeStat;

public abstract class HealthPoints extends IntRangeStat {
    public HealthPoints(int value) {
        super(value);
    }
}