package com.ironhack;

import com.ironhack.domain.characters.warrior.Warrior;
import com.ironhack.domain.characters.warrior.stats.WarriorBaseStats;
import com.ironhack.domain.characters.warrior.stats.WarriorCurrentStats;
import com.ironhack.domain.characters.wizard.Wizard;
import com.ironhack.domain.characters.wizard.stats.WizardBaseStats;
import com.ironhack.domain.characters.wizard.stats.WizardCurrentStats;
import com.ironhack.domain.characters.wizard.stats.attributes.Intelligence;
import com.ironhack.domain.characters.wizard.stats.attributes.Mana;
import com.ironhack.domain.characters.wizard.stats.attributes.WizardHealthPoints;
import com.ironhack.domain.party.Party;
import com.ironhack.domain.party.PartyBuilderRandom;
import net.datafaker.Faker;

public class Main {
    public static void main(String[] args) {

        // var faker = new Faker();
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

      /*   Party party = PartyBuilderRandom.buildParty(30);

        int idCount = 0;
        String name = "Hola";
        WizardHealthPoints hp = new WizardHealthPoints(13);
        int stamina = 13;
        int strength = 13; // if wizard or warrior
        Mana mana = new Mana(45);
        Intelligence intelligence = new Intelligence(50);
        WizardBaseStats wizardBaseStats = new WizardBaseStats(hp,mana,intelligence);
        WizardCurrentStats wizardCurrentStats = new WizardCurrentStats(hp, mana, intelligence);
        if(getRandomIntType() == 1){
          Character wizardChar = new Wizard(idCount++,name, wizardBaseStats, wizardCurrentStats, true);
        } var warriorChar = new Warrior(idCount++,name,warriorBaseStats,warriorCurrentStats, true);


        Wizard newWizard = new Wizard(1,name, wizardBaseStats, wizardCurrentStats, true);


    }

       */
    }
}
