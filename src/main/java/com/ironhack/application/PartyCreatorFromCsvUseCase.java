package com.ironhack.application;

import com.ironhack.domain.battle.Battle;
import com.ironhack.domain.characters.Character;
import com.ironhack.domain.generators.PartyGenerator;
import com.ironhack.domain.party.Party;
import com.ironhack.infrastructure.readers.CsvReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PartyCreatorFromCsvUseCase {

    private final Scanner scanner;
    Party myParty = new Party();
    Party enemyParty = new Party();

    public PartyCreatorFromCsvUseCase() {
        this.scanner = new Scanner(System.in);
    }

    public Party run() {
        System.out.println("=======================");
        System.out.println("Let's import a CSV file.");
        System.out.println("What's the file absolute path? ");
        var filepath = this.scanner.next();
//        ArrayList<Character> characters = null;
        Character[] characters;

        try {
            characters = CsvReader.read(filepath).toArray(new Character[0]);
//            for (int i = 0; i > characters.size(); i++){
//                myParty.addMember(characters.get(i));
//            }
            myParty.addMembers(characters);
            if(!myParty.isEmpty()) {
                System.out.println("Your party is created. Generating enemy party");
                Party enemyParty = PartyGenerator.randomParty(characters.length);
                System.out.println(enemyParty);
                //battle starts
                Battle battle = new Battle(myParty, enemyParty);
                battle.start();
            }
            else {
                System.out.println("Your party is empty, try again");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Party(characters);
    }
}
