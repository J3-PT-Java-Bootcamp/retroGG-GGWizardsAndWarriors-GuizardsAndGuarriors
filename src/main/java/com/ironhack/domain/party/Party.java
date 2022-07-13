package com.ironhack.domain.party;

import com.ironhack.domain.characters.Character;

import java.util.ArrayList;
import java.util.Random;

public class Party {
    protected ArrayList<Character> charactersList;

    public Party() {
        this.charactersList = new ArrayList<Character>();
    }

    public Party(Character[] characters) {
        this.charactersList = new ArrayList<Character>();
        this.addMembers(characters);
    }

    public Party(ArrayList<Character> characters) {
        this.charactersList = new ArrayList<>(characters);
    }

    public boolean isEmpty() {
        return this.charactersList.size() <= 0;
    }

    //TODO: Extract randomer
    public Character getRandomMember() {
        Random randomer = new Random();
        var randomIndex = randomer.nextInt(this.charactersList.size());
        return this.charactersList.get(randomIndex);
    }

    public void removeMember(Character character) {
        this.charactersList.remove(character);
    }

    public void addMember(Character character) {
        this.charactersList.add(character);
    }

    public void addMembers(Character[] characters) {
        for (Character character : characters) {
            this.addMember(character);
        }
    }

    @Override
    public String toString() {
        return String.format("""
                Party
                %s
                """, this.charactersList);
    }
}
