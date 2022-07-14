package com.ironhack.domain.generators;

import com.ironhack.domain.characters.stats.BaseStats;
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

import java.util.UUID;

public class Generator {
    Faker faker = new Faker();

    public Warrior randomWarrior(){
        UUID uuid = UUID.randomUUID();
        String name = faker.funnyName().toString();
        WarriorHealthPoints healthPoints = new WarriorHealthPoints(faker.random().nextInt(100,200));
        Stamina stamina = new Stamina(faker.random().nextInt(10,50));
        Strength strength = new Strength(faker.random().nextInt(1,10));

        WarriorBaseStats baseStats = new WarriorBaseStats(healthPoints, stamina, strength);

        return Warrior.create(uuid, name, baseStats);
    }

    public Warrior writtenWarrior(String writtenName, int writtenHp, int writtenStamina, int writtenStrength){
        UUID uuid = UUID.randomUUID();
        WarriorHealthPoints healthPoints = new WarriorHealthPoints(writtenHp);
        Stamina stamina = new Stamina(writtenStamina);
        Strength strength = new Strength(writtenStrength);

        WarriorBaseStats baseStats = new WarriorBaseStats(healthPoints, stamina, strength);

        return Warrior.create(uuid, writtenName, baseStats);
    }

    public Wizard randomWizard(){
        UUID uuid = UUID.randomUUID();
        String name = faker.funnyName().toString();
        WizardHealthPoints healthPoints = new WizardHealthPoints(faker.random().nextInt(100, 200));
        Mana mana = new Mana(faker.random().nextInt(10,50));
        Intelligence intelligence = new Intelligence(faker.random().nextInt(1, 50));


        WizardBaseStats baseStats = new WizardBaseStats(healthPoints, mana, intelligence);

        return Wizard.create(uuid, name, baseStats);
    }

    public Wizard writtenWizard(String writtenName, int writtenHp, int writtenMana, int writtenIntelligence){
        UUID uuid = UUID.randomUUID();
        WizardHealthPoints healthPoints = new WizardHealthPoints(writtenHp);
        Mana mana = new Mana(writtenMana);
        Intelligence intelligence = new Intelligence(writtenIntelligence);

        WizardBaseStats baseStats = new WizardBaseStats(healthPoints, mana, intelligence);

        return Wizard.create(uuid, writtenName, baseStats);
    }


}
