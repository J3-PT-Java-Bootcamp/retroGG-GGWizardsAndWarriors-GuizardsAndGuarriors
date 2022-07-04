package src.domain.party;

import src.domain.characters.warrior.Warrior;
import src.domain.characters.warrior.stats.*;

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
