package com.ironhack.application;

import com.ironhack.domain.battle.Battle;
import com.ironhack.domain.characters.warrior.stats.attributes.Stamina;
import com.ironhack.domain.exceptions.IllegalCharacterClassException;
import com.ironhack.domain.generators.CharacterGenerator;
import com.ironhack.domain.generators.PartyGenerator;
import com.ironhack.domain.party.Party;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PartyRandomCreator {

    private final Scanner scanner;
    Party myParty = new Party();

    public PartyRandomCreator() {
        this.scanner = new Scanner(System.in);
    }

    public Party run() {

        boolean exit = false;
        int option;
        System.out.println("===========================");
        System.out.println("Welcome to the random party creator!");
        while (!exit) {
            try {
                this.printOptions();
                option = this.scanner.nextInt();
                switch (option) {
                    case 1 -> {
                        System.out.println("Create new random party");
                        System.out.println("Party size: ");
                        int size = this.scanner.nextInt();
                        myParty = PartyGenerator.randomParty(size);
                        System.out.println("Your party is created. Generating enemy party");
                        Party enemyParty = PartyGenerator.randomParty(size);
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
            }
        }
        return myParty;
    }

    private void printOptions() {
        System.out.println("What do you want to do?");
        System.out.println("\t1 - Create a new random party");
        System.out.println("\t2 - View the current party characters");
        System.out.println("\t9 - Finish party creation");
        System.out.println("Enter an option:");
    }
}
