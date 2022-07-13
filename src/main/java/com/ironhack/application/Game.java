package com.ironhack.application;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    private final Scanner scanner;
    private final PartyCreatorFromCsvUseCase importCsvUseCase;
    public Game() {
        this.scanner = new Scanner(System.in);
        this.importCsvUseCase = new PartyCreatorFromCsvUseCase();
    }

    public void start() throws IOException {
        boolean exit = false;
        int option;
        this.printMenu();
        while (!exit) {
            try {
                option = this.scanner.nextInt();
                switch (option) {
                    case 1 -> {
                        System.out.println("By hand");
                        // create party usecase
                        //generate random enemy party
                        //battle
                    }
                    case 2 -> {
                        var party = this.importCsvUseCase.run();
                        System.out.println(party);
                        System.out.println("Generate random");
                        System.out.println("Battle");
                        // Generate random enemy party
                        // Battle
                    }
                    case 3 -> {
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

    public void printMenu() {
        System.out.println("Welcome to GuizardsAndGuarriors!");
        System.out.println("To start playing you should configure a party first.");
        System.out.println("You can either create a party by hand or import it through a CSV file.");
        System.out.println("How do you want to create the party?");
        System.out.println("\t1 - Create a party by hand");
        System.out.println("\t2 - Import a CSV");
        System.out.println("\t3 - Exit game.");
        System.out.println("Enter an option:");
    }
}
