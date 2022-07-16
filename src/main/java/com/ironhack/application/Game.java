package com.ironhack.application;

import com.ironhack.domain.generators.CharacterGenerator;
import com.ironhack.domain.party.Party;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    private final Scanner scanner;
    private final PartyCreatorFromCsvUseCase importCsvUseCase;
    private final PartyCreatorUseCase partyCreatorUseCase;
    private PartyRandomCreator PartyRandomCreator;

    public Game() {
        this.scanner = new Scanner(System.in);
        this.PartyRandomCreator = new PartyRandomCreator();
        this.partyCreatorUseCase = new PartyCreatorUseCase();
        this.importCsvUseCase = new PartyCreatorFromCsvUseCase();
    }

    public void start() throws IOException {
        CharacterGenerator.cleanUsedNamesList();
        CharacterGenerator.fillArrayOfNames();

        boolean exit = false;
        Party myParty;
        int option;
        while (!exit) {
            this.printMenu();
            try {
                option = this.scanner.nextInt();
                switch (option) {
                    case 1 -> {
                        myParty = this.PartyRandomCreator.run();
                    }

                    case 2 -> {
                        myParty = this.partyCreatorUseCase.run();
                    }

                    case 3 -> {
                        myParty = this.importCsvUseCase.run();
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
