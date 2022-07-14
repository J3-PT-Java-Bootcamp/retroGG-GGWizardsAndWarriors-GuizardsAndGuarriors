package com.ironhack.application;

import com.ironhack.domain.characters.warrior.Warrior;
import com.ironhack.domain.characters.warrior.stats.WarriorBaseStats;
import com.ironhack.domain.characters.warrior.stats.attributes.Stamina;
import com.ironhack.domain.characters.wizard.Wizard;
import com.ironhack.domain.characters.wizard.stats.WizardBaseStats;
import com.ironhack.domain.exceptions.IllegalCharacterClassException;
import com.ironhack.domain.party.Party;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;

public class PartyCreatorUseCase {

    private final Scanner scanner;

    public PartyCreatorUseCase() {
        this.scanner = new Scanner(System.in);
    }

    public Party run() {
        var party = new Party();

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
                        System.out.println("Create new character");
                        createCharacter();
                        // create party usecase
                        //generate random enemy party
                        //battle
                    }
                    case 2 -> {
                        if(!party.isEmpty()){
                            System.out.println(party);
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
            } catch (IllegalCharacterClassException e) {
                System.out.println("The selected class is not valid. Start over the character creation. ");
            }
        }
        return party;
    }

    private void createCharacter() throws IllegalCharacterClassException {
        System.out.println("Character name: ");
        var name = this.scanner.next();
        System.out.println("Character class (Warrior or Wizard): ");
        var characterClass = this.scanner.next();
        if(characterClass.toLowerCase().trim().equals("warrior")) {
            System.out.println(String.format("How much stamina? (%d-%d): ", Stamina.MIN_VALUE, Stamina.MAX_VALUE));
            var stamina = this.scanner.nextInt();
//            System.out.println(String.format("How much stamina? (%d-%d): ", MIN_VALUE, Stamina.MAX_VALUE));
//            var strength = this.scanner.nextInt();
//            WarriorBaseStats = new WarriorBaseStats(stamina,)
//            if (stamina < Stamina.MIN_VALUE && stamina > Stamina.MAX_VALUE){
//                Warrior.create(UUID.randomUUID(),name,);
//            }

        } else if (characterClass.toLowerCase().trim().equals("wizard")) {
//            Wizard.create(UUID.randomUUID(), stats,);

        } else {
            throw new IllegalCharacterClassException();
        }
    }

    private void printOptions() {
        System.out.println("What do you want to do?");
        System.out.println("\t1 - Create a new character");
        System.out.println("\t2 - View the current party characters");
        System.out.println("\t9 - Finish party creation");
        System.out.println("Enter an option:");
    }
}
