package com.ironhack.domain.battle;

import com.ironhack.domain.characters.Character;

public class Duel {

    private static boolean isFinished(Character character1, Character character2) {
        return !character1.isAlive() || !character2.isAlive();
    }

    public static void fight(Character battler1, Character battler2) {
        while (!isFinished(battler1, battler2)) {
            battler1.attack(battler2);
            battler2.attack(battler1);
        }
    }


}
