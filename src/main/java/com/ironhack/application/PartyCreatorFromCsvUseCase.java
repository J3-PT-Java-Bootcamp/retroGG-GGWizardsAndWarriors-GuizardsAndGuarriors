package com.ironhack.application;

import com.ironhack.domain.characters.Character;
import com.ironhack.domain.party.Party;
import com.ironhack.infrastructure.readers.CsvReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PartyCreatorFromCsvUseCase {

    private final Scanner scanner;

    public PartyCreatorFromCsvUseCase() {
        this.scanner = new Scanner(System.in);
    }

    public Party run() {
        System.out.println("=======================");
        System.out.println("Let's import a CSV file.");
        System.out.println("What's the file absolute path? ");
        var filepath = this.scanner.next();
        ArrayList<Character> characters = null;
        try {
            characters = CsvReader.read(filepath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Party(characters);
    }
}
