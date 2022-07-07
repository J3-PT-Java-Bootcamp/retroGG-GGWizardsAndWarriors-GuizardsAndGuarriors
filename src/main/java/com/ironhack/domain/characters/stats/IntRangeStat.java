package com.ironhack.domain.characters.stats;

public abstract class IntRangeStat {
    private int value;

    public IntRangeStat(int value) {
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
}
