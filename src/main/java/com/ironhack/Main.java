package com.ironhack;

import com.ironhack.domain.characters.warrior.Warrior;
import com.ironhack.domain.characters.warrior.stats.attributes.Stamina;
import com.ironhack.domain.characters.warrior.stats.attributes.Strength;
import com.ironhack.domain.characters.warrior.stats.attributes.WarriorHealthPoints;
import com.ironhack.domain.generators.CharacterGenerator;
import com.ironhack.domain.generators.PartyGenerator;
import com.ironhack.domain.party.Party;
import net.datafaker.Faker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) throws IOException {

        Party party = new Party();
        PartyGenerator.writtenParty(10);
        System.out.println(party.toString());
    }

//        Generator generator = new Generator();
//        System.out.println(generator.randomWarrior());
//        for (int i = 0; i < 100; i++) {
//            System.out.println(generator.randomWarrior());
//        }

//        var stats = new WizardBaseStats(new WizardHealthPoints(100), new Mana(150), new Intelligence(125));
//        var wizard = Wizard.create(1, "Pepe", stats);
//        var party = new Party();
//        party.addMember(wizard);
//        party.addMember(wizard);
//        System.out.println(party);
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
    }

