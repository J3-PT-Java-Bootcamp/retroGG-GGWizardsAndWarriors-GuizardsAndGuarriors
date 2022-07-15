package com.ironhack.domain.battle;

import com.ironhack.domain.characters.Character;
import com.ironhack.domain.graveyard.Graveyard;
import com.ironhack.domain.party.Party;

import java.util.Random;
import java.util.Scanner;

public class Battle {

    private final Party party1;
    private final Party party2;
    private final Graveyard graveyard;
    private Scanner scanner;


    public Battle(Party party1, Party party2) {
        this.party1 = party1;
        this.party2 = party2;
        graveyard = new Graveyard();
    }

    private void printKill(Character dead, Character killer) {
        System.out.printf("Character %s has been killed by %s. The gravedigger is preparing a tomb...\n", dead.getName(), killer.getName());
        System.out.printf("Burying %s...\n", dead.getName());
        System.out.printf("%s spirit will remain in our hearts <3\n", dead.getName());
    }
//same method as above but saying that they died at the same time
    private void printTieKill(Character dead, Character killer) {
        System.out.printf("Character %s has been killed by %s. The gravedigger is preparing two tombs...  BECAUSE THIS TIME HE DIED KILLING TOO!\n", dead.getName(), killer.getName());
        System.out.printf("Burying %s and %s...\n", dead.getName(), killer.getName());
        System.out.printf("%s and %s spirits will remain in our hearts <3\n", dead.getName(), killer.getName());
    }

    public void start() {
        System.out.println("The battle is about to start...");
        while (!isFinished()) {
            //select combatants to fight
            System.out.println("Select the combatant from the party one from the next list, use its position on the list being 0 the first: ");
            System.out.println(party1.toString());
            int answer = this.scanner.nextInt();
            System.out.println("Select the combatant from the party two from the next list, use its position on the list being 0 the first: ");
            System.out.println(party2.toString());
            var character1 = party1.getCharactersList().get(answer);
            var character2 = party2.getCharactersList().get(answer);
            System.out.printf("Next turn: %s vs %s%n", character1.getName(), character2.getName());
            Duel.fight(character1, character2);
            if (!character1.isAlive()&&!character2.isAlive()) {
                printTieKill(character1, character2);
                party1.removeMember(character1);
                party2.removeMember(character2);
                graveyard.bury(character1);
                graveyard.bury(character2);
            }
            if (!character1.isAlive()) {
                printKill(character1, character2);
                party1.removeMember(character1);
                graveyard.bury(character1);
            }
            if (!character2.isAlive()) {
                printKill(character2, character1);
                party2.removeMember(character2);
                graveyard.bury(character2);
            }
        }
        System.out.println("The battle has ended!");
        if (party1.isEmpty() && party2.isEmpty()) {
            System.out.println("It's a draw... both teams died entirely.");
        } else if (party1.isEmpty()) {
            System.out.println("Party one won!");
        } else if (party2.isEmpty()) {
            System.out.println("Party two won!");
        }
        scanner.close();
    }

    private boolean isFinished() {
        return party1.isEmpty() && party2.isEmpty();
    }
}
