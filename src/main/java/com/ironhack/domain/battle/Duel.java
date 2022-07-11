package com.ironhack.domain.battle;

import com.ironhack.domain.characters.Character;

public class Duel {

    private final Character battler1;
    private final Character battler2;

    public Duel(Character battler1, Character battler2) {
        this.battler1 = battler1;
        this.battler2 = battler2;
    }

    public boolean isFinished() {
        return this.battler1.isAlive() || this.battler2.isAlive();
    }

    public void run() {
        while (!isFinished()) {
            battler1.attack(battler2);
            battler2.attack(battler1);
        }
    }



}
