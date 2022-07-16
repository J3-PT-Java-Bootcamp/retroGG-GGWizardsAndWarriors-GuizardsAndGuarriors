package com.ironhack.domain.generators;

import com.ironhack.domain.characters.Character;
import com.ironhack.domain.characters.warrior.Warrior;
import com.ironhack.domain.characters.warrior.stats.WarriorBaseStats;
import com.ironhack.domain.characters.warrior.stats.attributes.Stamina;
import com.ironhack.domain.characters.warrior.stats.attributes.Strength;
import com.ironhack.domain.characters.warrior.stats.attributes.WarriorHealthPoints;
import com.ironhack.domain.characters.wizard.Wizard;
import com.ironhack.domain.characters.wizard.stats.WizardBaseStats;
import com.ironhack.domain.characters.wizard.stats.attributes.Intelligence;
import com.ironhack.domain.characters.wizard.stats.attributes.Mana;
import com.ironhack.domain.characters.wizard.stats.attributes.WizardHealthPoints;
import net.datafaker.Faker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.UUID;

public class CharacterGenerator {

    private static int MAX_HP = 200;
    private static int MIN_HP = 100;
    private static int MAX_STAMINA = 50;
    private static int MIN_STAMINA = 10;
    private static int MAX_STRENGTH = 10;
    private static int MIN_STRENGTH = 1;
    private static int MAX_MANA = 50;
    private static int MIN_MANA = 10;
    private static int MAX_INTELLIGENCE = 50;
    private static int MIN_INTELLIGENCE = 1;

    private static int NAMES_LIST_SIZE = 50;
    static Faker faker = new Faker();
    static ArrayList<String> randomNames = new ArrayList<String>();
    static ArrayList<String> usedNames = new ArrayList<String>();

    public static Character randomCharacter(){
        if (faker.random().nextInt(0, 1) == 0) {
            return CharacterGenerator.randomWarrior();
        } else {
            return CharacterGenerator.randomWizard();
        }
    }

    public static Warrior randomWarrior(){
        UUID uuid = UUID.randomUUID();
        String name = randomName();
        WarriorHealthPoints healthPoints = new WarriorHealthPoints(faker.random().nextInt(MIN_HP, MAX_HP));
        Stamina stamina = new Stamina(faker.random().nextInt(MIN_STAMINA, MAX_STAMINA));
        Strength strength = new Strength(faker.random().nextInt(MIN_STRENGTH, MAX_STRENGTH));

        WarriorBaseStats baseStats = new WarriorBaseStats(healthPoints, stamina, strength);
        usedNames.add(name);

        return Warrior.create(uuid, name, baseStats);
    }

    public static Warrior writtenWarrior() throws IOException {
        UUID uuid = UUID.randomUUID();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Specify hp points: ");
        WarriorHealthPoints healthPoints = new WarriorHealthPoints(Integer.parseInt(reader.readLine()));
        System.out.println("Specify stamina points: ");
        Stamina stamina = new Stamina(Integer.parseInt(reader.readLine()));
        System.out.println("Specify strength points: ");
        Strength strength = new Strength(Integer.parseInt(reader.readLine()));
        System.out.println("Specify name: ");
        String name = reader.readLine();

        WarriorBaseStats baseStats = new WarriorBaseStats(healthPoints, stamina, strength);
        usedNames.add(name);

        return Warrior.create(uuid, name, baseStats);
    }

    public static Wizard randomWizard(){
        UUID uuid = UUID.randomUUID();
        String name = randomName();
        WizardHealthPoints healthPoints = new WizardHealthPoints(faker.random().nextInt(MIN_HP, MAX_HP));
        Mana mana = new Mana(faker.random().nextInt(MIN_MANA, MAX_MANA));
        Intelligence intelligence = new Intelligence(faker.random().nextInt(MIN_INTELLIGENCE, MAX_INTELLIGENCE));


        WizardBaseStats baseStats = new WizardBaseStats(healthPoints, mana, intelligence);
        usedNames.add(name);

        return Wizard.create(uuid, name, baseStats);
    }

    public static Wizard writtenWizard() throws IOException {
        UUID uuid = UUID.randomUUID();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Specify hp points: ");
        WizardHealthPoints healthPoints = new WizardHealthPoints(Integer.parseInt(reader.readLine()));
        System.out.println("Specify mana points: ");
        Mana mana = new Mana(Integer.parseInt(reader.readLine()));
        System.out.println("Specify intelligence points: ");
        Intelligence intelligence = new Intelligence(Integer.parseInt(reader.readLine()));
        System.out.println("Specify name: ");
        String name = reader.readLine();

        WizardBaseStats baseStats = new WizardBaseStats(healthPoints, mana, intelligence);
        usedNames.add(name);

        return Wizard.create(uuid, name, baseStats);
    }

    public static String randomName(){
        String comparedName =  randomNames.get(faker.random().nextInt(0, randomNames.size()-1));
        if (usedNames.contains(comparedName)){
            randomNames.remove(comparedName);

            String jrName = comparedName + " Jr.";
            usedNames.add(jrName);
            randomNames.add(jrName);
            return jrName;
        }
        return comparedName;
    }

    public static void fillArrayOfNames(){
        for (int i = 0; i < NAMES_LIST_SIZE; i++) {
            String name = faker.funnyName().name();
            randomNames.add(name);
        }
    }

    public static void cleanUsedNamesList(){
        usedNames.clear();
        randomNames.clear();
    }
}
