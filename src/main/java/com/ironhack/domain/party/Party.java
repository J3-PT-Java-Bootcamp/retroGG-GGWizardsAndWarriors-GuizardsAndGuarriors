package com.ironhack.domain.party;

<<<<<<<< HEAD:src/domain/party/Party.java
package src.domain.party;
========
package com.ironhack;
>>>>>>>> develop:src/main/java/com/ironhack/Party.java

import com.ironhack.domain.characters.Character;

import java.util.ArrayList;

public class Party {
    protected ArrayList<Character> charactersList;

    public Party() {
        this.charactersList = new ArrayList<Character>();
    }

    public Party(Character[] characters) {
        this.charactersList = new ArrayList<Character>();
        this.addPartyMembers(characters);
    }

    public void addPartyMember(Character character) {
        this.charactersList.add(character);
    }

    public void addPartyMembers(Character[] characters) {
        for (Character character : characters) {
            this.addPartyMember(character);
        }
    }

}
