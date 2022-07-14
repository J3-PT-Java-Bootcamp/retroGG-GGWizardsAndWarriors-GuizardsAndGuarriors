package com.ironhack.application;

import com.ironhack.domain.characters.warrior.stats.attributes.Stamina;
import com.ironhack.domain.exceptions.IllegalCharacterClassException;
import com.ironhack.domain.party.Party;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PartyRandomCreator {

    private final Scanner scanner;

    public PartyRandomCreator() {
        this.scanner = new Scanner(System.in);
    }

    public Party run() {
        var party = new Party();

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
                        System.out.println("Create new party");
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
            }
        }
        return party;
    }

    private void createParty() {
        System.out.println("Party size: ");
        var name = this.scanner.nextInt();
    }

    private void printOptions() {
        System.out.println("What do you want to do?");
        System.out.println("\t1 - Create a new random party");
        System.out.println("\t2 - View the current party characters");
        System.out.println("\t9 - Finish party creation");
        System.out.println("Enter an option:");
    }
}
