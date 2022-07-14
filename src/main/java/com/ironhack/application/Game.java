package com.ironhack.application;

import com.ironhack.domain.party.Party;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    private final Scanner scanner;
    private final PartyCreatorFromCsvUseCase importCsvUseCase;
    private final PartyCreatorUseCase partyCreatorUseCase;
    public Game() {
        this.scanner = new Scanner(System.in);
        this.importCsvUseCase = new PartyCreatorFromCsvUseCase();
        this.partyCreatorUseCase = new PartyCreatorUseCase();
    }

    public void start() throws IOException {
        boolean exit = false;
        Party myParty;
        int option;
        this.printMenu();
        while (!exit) {
            try {
                option = this.scanner.nextInt();
                switch (option) {
                    case 1 -> {
                        myParty = this.partyCreatorUseCase.run();
                        System.out.println(myParty);
                        System.out.println("Generate random");
                        System.out.println("Battle");
                        // create party usecase
                        //generate random enemy party
                        //battle
                    }

                    case 2 -> {
                        myParty = this.partyCreatorUseCase.run();
                        System.out.println(myParty);
                        System.out.println("Generate by hand");
                        System.out.println("Battle");
                        // create party usecase
                        //generate random enemy party
                        //battle
                    }

                    case 3 -> {
                        myParty = this.importCsvUseCase.run();
                        System.out.println(myParty);
                        System.out.println("Generate from file");
                        System.out.println("Battle");
                        // Generate random enemy party
                        // Battle
                    }
                    case 9 -> {
                        exit = true;
                        System.out.println("See you later!");
                    }
                    default -> System.out.println("The selected option is not valid. Please, select a valid option:");
                }
            } catch (InputMismatchException exception) {
                System.out.println("The selected option is not valid. Please, select a valid option:");
                this.scanner.next();
            }
        }
    }

    private void printMenu() {
        System.out.println("Welcome to GuizardsAndGuarriors!");
        System.out.println("To start playing you should configure a party first.");
        System.out.println("You can create a random party, create the party by hand or import it through a CSV file.");
        System.out.println("How do you want to create the party?");
        System.out.println("\t1 - Create a random party");
        System.out.println("\t2 - Create a party by hand");
        System.out.println("\t3 - Import a CSV");
        System.out.println("\t9 - Exit game.");
        System.out.println("Enter an option:");
    }
}
