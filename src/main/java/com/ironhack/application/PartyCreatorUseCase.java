package com.ironhack.application;

import com.ironhack.domain.battle.Battle;
import com.ironhack.domain.characters.warrior.stats.attributes.Stamina;
import com.ironhack.domain.exceptions.IllegalCharacterClassException;
import com.ironhack.domain.generators.PartyGenerator;
import com.ironhack.domain.party.Party;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PartyCreatorUseCase {

    private final Scanner scanner;

    Party myParty = new Party();
    Party enemyParty = new Party();

    public PartyCreatorUseCase() {
        this.scanner = new Scanner(System.in);
    }

    public Party run() {

        boolean exit = false;
        int option;
        System.out.println("===========================");
        System.out.println("Welcome to the party creator!");
        while (!exit) {
            try {
                this.printOptions();
                option = this.scanner.nextInt();
                switch (option) {
                    case 1 -> {
                        // create party usecase
                        System.out.println("Create new party with the stats you want");
                        System.out.println("Party size: ");
                        int size = this.scanner.nextInt();
                        myParty = PartyGenerator.writtenParty(size);
                        System.out.println("Your party is created. Generating enemy party");
                        //generate random enemy party
                         enemyParty = PartyGenerator.randomParty(size);
                        //battle
                        Battle battle = new Battle(myParty, enemyParty);
                        battle.start();
                    }
                    case 2 -> {
                        if(!myParty.isEmpty()){
                            System.out.println(myParty);
                        } else{
                            System.out.println("Party is empty");
                        }
                    }
                    case 9 -> {
                        exit = true;
                    }
                    default -> System.out.println("The selected option is not valid. Please, select a valid option:");
                }
            } catch (InputMismatchException exception) {
                System.out.println("The selected option is not valid. Please, select a valid option:");
                this.scanner.next();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return myParty;
    }

    private void createCharacter() throws IllegalCharacterClassException {
        System.out.println("Character name: ");
        var name = this.scanner.next();
        System.out.println("Character class (Warrior or Wizard): ");
        var characterClass = this.scanner.next();
        if(characterClass.toLowerCase().trim().equals("warrior")) {
            System.out.println(String.format("How much stamina? (%d-%d): ", Stamina.MIN_VALUE, Stamina.MAX_VALUE));
            var stamina = this.scanner.nextInt();

        } else if (characterClass.toLowerCase().trim().equals("wizard")) {

        } else {
            throw new IllegalCharacterClassException();
        }
    }

    private void printOptions() {
        System.out.println("What do you want to do?");
        System.out.println("\t1 - Create a new party");
        System.out.println("\t2 - View the current party characters");
        System.out.println("\t9 - Finish party creation");
        System.out.println("Enter an option:");
    }
}
