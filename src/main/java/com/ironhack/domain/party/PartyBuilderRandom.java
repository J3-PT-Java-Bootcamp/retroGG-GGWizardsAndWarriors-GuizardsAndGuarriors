package com.ironhack.domain.party;

import com.ironhack.domain.characters.Character;
import com.ironhack.domain.characters.warrior.Warrior;
import com.ironhack.domain.characters.warrior.stats.WarriorBaseStats;
import com.ironhack.domain.characters.warrior.stats.WarriorCurrentStats;
import com.ironhack.domain.characters.wizard.Wizard;
import com.ironhack.domain.characters.wizard.stats.WizardBaseStats;
import com.ironhack.domain.characters.wizard.stats.WizardCurrentStats;
import com.ironhack.domain.characters.wizard.stats.attributes.Intelligence;
import com.ironhack.domain.characters.wizard.stats.attributes.Mana;
import com.ironhack.domain.characters.wizard.stats.attributes.WizardHealthPoints;
import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class PartyBuilderRandom {

    static Faker faker = new Faker();
    private static final int MAX_HP = 200;
    private static final int MIN_HP = 100;
    private static final int MAX_STAMINA = 50;
    private static final int MIN_STAMINA = 10;
    private static final int MAX_STRENGTH = 10;
    private static final int MIN_STRENGTH = 1;
    private static final int MAX_MANA = 50;
    private static final int MIN_MANA = 10;
    private static final int MAX_INTELLIGENCE = 50;
    private static final int MIN_INTELLIGENCE = 1;


    private static String[] randomListName;



    public PartyBuilderRandom() {randomListName = fillListName(30);
    }

    public static String[] fillListName(int numElements) {
        for (int i = 0; i < numElements; i++) {
            String randomName = faker.funnyName().name();
            randomListName[i] = randomName;
        }
        return randomListName;
    }


    public static Character getRandomCharacters() {
        int idCount = 0;
        int type = getRandomIntType();
        String name = getRandomName();
        WizardHealthPoints hp = new WizardHealthPoints(getRandomIntHp());
        int stamina = getRandomIntStamina();
        int strength = getRandomIntStrength();
        Mana mana = new Mana(getRandomIntMana());
        Intelligence intelligence = new Intelligence(getRandomIntIntelligence());
        WizardBaseStats wizardBaseStats = new WizardBaseStats(hp, mana, intelligence);
        WizardCurrentStats wizardCurrentStats = new WizardCurrentStats(hp, mana, intelligence);
        WarriorBaseStats warriorBaseStats = new WarriorBaseStats(hp, stamina, strength);
        WarriorCurrentStats warriorCurrentStats = new WarriorCurrentStats(hp, stamina, strength);
        if (getRandomIntType() == 1) {
            Wizard wizardChar = new Wizard(idCount++, name, wizardBaseStats, wizardCurrentStats, true);
            return wizardChar;
        }
        Warrior warriorChar = new Warrior(idCount++, name, warriorBaseStats, warriorCurrentStats, true);
        return warriorChar;
    }

    public static Party buildParty(int size) {
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            characters.add(getRandomCharacters());
        }
        return new Party(characters);
    }

    private static int getRandomIntHp() {
        return (int) ( Math.random() * ( MAX_HP - MIN_HP ) + MIN_HP );
    }

    private static int getRandomIntStamina() {
        return (int) ( Math.random() * ( MAX_STAMINA - MIN_STAMINA ) + MIN_STAMINA );
    }

    private static int getRandomIntStrength() {
        return (int) ( Math.random() * ( MAX_STRENGTH - MIN_STRENGTH ) + MIN_STRENGTH );
    }

    private static int getRandomIntMana() {
        return (int) ( Math.random() * ( MAX_MANA - MIN_MANA ) + MIN_MANA );
    }

    private static int getRandomIntIntelligence() {
        return (int) ( Math.random() * ( MAX_INTELLIGENCE - MIN_INTELLIGENCE ) + MIN_INTELLIGENCE );
    }

    private static int getRandomIntType() {
        return (int) ( Math.random() * ( 2 - 1 ) + 1 );
    }


    private static String getRandomName() {
        int index = (int) ( Math.random() * randomListName.length );
        String name = randomListName[index];

        if (nameTaken(name)) {
            name = name + " Jr.";
        }
        return name;
    }

    private static boolean nameTaken(String name) {
        for (String takenName : randomListName) {
            if (takenName.equals(name)) {
                return true;
            }
        }
        return false;
    }

}



