package com.ironhack.application;

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
//                        createParty(size); TODO Ana delete comment
                        myParty = PartyGenerator.randomParty(size);
                        System.out.println("Your party is created. Generating enemy party");
                        Party enemyParty = PartyGenerator.randomParty(size);
                        
                        //generate random enemy party
                        //battle
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

    // Reemplazando este metodo con lo que hay en el package generators TODO Ana delete comment
//    private void createParty(int size) {
//        for (int i = 0; i < size; i++) {
//            if (this.getRandomInt() == 1) {
//                party.addMember(CharacterGenerator.randomWizard());
//
//            } else {
//                party.addMember(CharacterGenerator.randomWarrior());
//            }
//        }
//    }

    private void printOptions() {
        System.out.println("What do you want to do?");
        System.out.println("\t1 - Create a new random party");
        System.out.println("\t2 - View the current party characters");
        System.out.println("\t9 - Finish party creation");
        System.out.println("Enter an option:");
    }

    // Reemplazando este metodo con lo que hay en el package generators TODO Ana delete comment
//    private int getRandomInt() {
//        return (int) (Math.random() * (2 + 1));
//    }
}
