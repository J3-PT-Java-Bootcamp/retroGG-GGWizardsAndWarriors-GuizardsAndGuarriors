package com.ironhack.domain.characters.stats;

import java.util.Optional;

public abstract class IntRangeStat {
    private int value;

    public IntRangeStat(int value) {
        this.setValue(value);
    }

    public IntRangeStat(Optional<String> value) {
        this.setValue(value);
    }

    public abstract int getMaxValue();

    public abstract int getMinValue();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < this.getMinValue()) {
            this.value = this.getMinValue();
        } else {
            this.value = Math.min(value, this.getMaxValue());
        }
    }

    public void setValue(Optional<String> value) {
        try {
            value.ifPresent(s -> this.value = Integer.parseInt(s));
        } catch (NumberFormatException exception) {
            this.value = this.getMinValue();
        }
    }
}
