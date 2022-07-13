package com.ironhack.application;

import com.ironhack.domain.party.Party;

import java.util.Scanner;

public class PartyCreatorUseCase {

    private final Scanner scanner;

    public PartyCreatorUseCase() {
        this.scanner = new Scanner(System.in);
    }

    public Party run() {
        var party = new Party();
        

        return party;
    }
}
