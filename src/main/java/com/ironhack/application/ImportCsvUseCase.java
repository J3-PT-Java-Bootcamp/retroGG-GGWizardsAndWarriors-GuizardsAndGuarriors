package com.ironhack.application;

import com.ironhack.domain.characters.Character;
import com.ironhack.domain.party.Party;
import com.ironhack.infrastructure.readers.CsvReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportCsvUseCase {

    private final Scanner scanner;

    public ImportCsvUseCase() {
        this.scanner = new Scanner(System.in);
    }

    public Party importPartyFromCsv() {
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
