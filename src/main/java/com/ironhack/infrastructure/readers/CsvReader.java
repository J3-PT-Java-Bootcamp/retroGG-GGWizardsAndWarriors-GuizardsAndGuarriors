package com.ironhack.infrastructure.readers;

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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public class CsvReader {
    private static final String DELIMITER = ",";

    public static ArrayList<Character> read(String fileName) throws IOException {
        ArrayList<Character> characters = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split(DELIMITER);
            // CSV header structure name, class, hp, stamina, strength, mana, intelligence
            Optional<String> characterClass = Optional.ofNullable(tokens[1]);

            Character currentCharacter;
            if (characterClass.isPresent()) {
                UUID uuid = UUID.randomUUID();
                Optional<String> nameToken = Optional.ofNullable(tokens[0]);
                Optional<String> hpToken = Optional.ofNullable(tokens[2]);
                Optional<String> staminaToken = Optional.ofNullable(tokens[3]);
                Optional<String> strengthToken = Optional.ofNullable(tokens[4]);
                Optional<String> manaToken = Optional.ofNullable(tokens[5]);
                Optional<String> intelligenceToken = Optional.ofNullable(tokens[6]);

                var name = nameToken.orElse(String.format("NoNameCharacter-%s", uuid));

                switch (characterClass.get().toLowerCase()) {
                    case "wizard" -> {
                        var stats = new WizardBaseStats(new WizardHealthPoints(hpToken), new Mana(manaToken), new Intelligence(intelligenceToken));
                        currentCharacter = Wizard.create(uuid, name, stats);
                    }
                    case "warrior" -> {
                        var stats = new WarriorBaseStats(new WarriorHealthPoints(hpToken), new Stamina(staminaToken), new Strength(strengthToken));
                        currentCharacter = Warrior.create(uuid, name, stats);
                    }
                    default -> currentCharacter = null;
                }
                if (currentCharacter != null) {
                    characters.add(currentCharacter);
                }
            }
        }
        reader.close();
        return characters;
    }

}

