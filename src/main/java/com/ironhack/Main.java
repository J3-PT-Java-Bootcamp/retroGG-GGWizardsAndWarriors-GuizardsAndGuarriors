package com.ironhack;

import com.ironhack.domain.party.Party;
import com.ironhack.domain.party.PartyBuilderRandom;
import net.datafaker.Faker;

public class Main {
    public static void main(String[] args) {

        var faker = new Faker();
//        Party party1 = new Party();
//        Party party2 = new Party();
//
//        for(int i = 0; i < 5; i++) {
//            party1.addWizard(new Wizard("Wizard " + i, 100, 10, 1, 10, 1));
//            party1.addWarrior(new Warrior("Warrior " + i, 200, 50, 10, 10, 1));
//        }
//
//        for(int i = 0; i < 5; i++) {
//            party2.addWizard(new Wizard("Wizard " + i, 100, 10, 1, 10, 1));
//            party2.addWarrior(new Warrior("Warrior " + i, 200, 50, 10, 10, 1));
//        }
//
//        Battle battle = new Battle(party1, party2);
//        battle.start();

        Party party = PartyBuilderRandom.buildParty(30);

    }
}
