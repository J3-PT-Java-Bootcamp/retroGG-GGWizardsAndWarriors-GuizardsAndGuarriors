package com.ironhack.domain.battle;

import com.ironhack.domain.graveyard.Graveyard;
import com.ironhack.domain.party.Party;

public class Battle {

    private final Party party1;
    private final Party party2;
    private final Graveyard graveyard;

    public Battle(Party party1, Party party2) {
        this.party1 = party1;
        this.party2 = party2;
        graveyard = new Graveyard();
    }

    public void start() {
        System.out.println("The battle is about to start...");
        while (!isFinished()) {
            System.out.println("The blind hand is selecting two fighters...");
            var character1 = party1.getRandomMember();
            var character2 = party2.getRandomMember();
            System.out.printf("Next turn: %s vs %s%n", character1.getName(), character2.getName());
            System.out.println();
            Duel.fight(character1, character2);
            if (!character1.isAlive()) {
                party1.removeMember(character1);
                graveyard.bury(character1);
            }
            if (!character2.isAlive()) {
                party2.removeMember(character2);
                graveyard.bury(character2);
            }
        }
        System.out.println("The battle has ended!");
    }

    private boolean isFinished() {
        return party1.isEmpty() && party2.isEmpty();
    }
}
