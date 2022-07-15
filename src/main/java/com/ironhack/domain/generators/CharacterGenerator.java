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
import java.util.UUID;

public class CharacterGenerator {
    static Faker faker = new Faker();

    public static Character randomCharacter(){
        if (faker.random().nextInt(0, 1) == 0) {
            return CharacterGenerator.randomWarrior();
        } else {
            return CharacterGenerator.randomWizard();
        }
    }

    public static Warrior randomWarrior(){
        UUID uuid = UUID.randomUUID();
        String name = faker.funnyName().name();
        WarriorHealthPoints healthPoints = new WarriorHealthPoints(faker.random().nextInt(100,200));
        Stamina stamina = new Stamina(faker.random().nextInt(10,50));
        Strength strength = new Strength(faker.random().nextInt(1,10));

        WarriorBaseStats baseStats = new WarriorBaseStats(healthPoints, stamina, strength);

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

        return Warrior.create(uuid, name, baseStats);
    }

    public static Wizard randomWizard(){
        UUID uuid = UUID.randomUUID();
        String name = faker.funnyName().name();
        WizardHealthPoints healthPoints = new WizardHealthPoints(faker.random().nextInt(100, 200));
        Mana mana = new Mana(faker.random().nextInt(10,50));
        Intelligence intelligence = new Intelligence(faker.random().nextInt(1, 50));


        WizardBaseStats baseStats = new WizardBaseStats(healthPoints, mana, intelligence);

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

        return Wizard.create(uuid, name, baseStats);
    }


}
