package com.ironhack;

import com.ironhack.domain.characters.wizard.Wizard;
import com.ironhack.domain.characters.wizard.stats.WizardBaseStats;
import com.ironhack.domain.characters.wizard.stats.attributes.Intelligence;
import com.ironhack.domain.characters.wizard.stats.attributes.Mana;
import com.ironhack.domain.characters.wizard.stats.attributes.WizardHealthPoints;
import com.ironhack.domain.party.Party;

public class Main {
    public static void main(String[] args) {
            var stats = new WizardBaseStats(new WizardHealthPoints(100), new Mana(150), new Intelligence(125));
            var wizard = Wizard.create(1, "Pepe", stats, true);
            var party = new Party();
            party.addMember(wizard);
            party.addMember(wizard);
        System.out.println(party);
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
}
