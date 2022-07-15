package com.ironhack.domain.generators;

import com.ironhack.domain.characters.warrior.Warrior;
import com.ironhack.domain.characters.warrior.stats.WarriorBaseStats;
import com.ironhack.domain.characters.warrior.stats.attributes.Stamina;
import com.ironhack.domain.characters.warrior.stats.attributes.Strength;
import com.ironhack.domain.characters.warrior.stats.attributes.WarriorHealthPoints;
import com.ironhack.domain.party.Party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.UUID;

public class PartyGenerator{

    public static Party randomParty(int size) {
        Party party = new Party();

        for (int i = 0; i < size; i++) {
            party.addMember(CharacterGenerator.randomCharacter());
        }
        return party;
    }

    public static Party writtenParty(int size) throws IOException {
        Party party = new Party();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < size; i++) {
            System.out.println("If you want to create a Warrior enter WA, for a wizard, enter WI");
            String response = reader.readLine().toUpperCase();

            if (response.equals("WA") ) {
                party.addMember(CharacterGenerator.writtenWarrior());
            } else if (response.equals("WI")) {
                party.addMember(CharacterGenerator.writtenWizard());
            }

        }
        return party;
    }
}
