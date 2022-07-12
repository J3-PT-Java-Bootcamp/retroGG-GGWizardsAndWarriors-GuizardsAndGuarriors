package com.ironhack.domain.characters.stats.attributes;

import com.ironhack.domain.characters.stats.IntRangeStat;

import java.util.Optional;

public abstract class HealthPoints extends IntRangeStat {
    public HealthPoints(int value) {
        super(value);
    }

    public HealthPoints(Optional<String> value) {
        super(value);
    }
}