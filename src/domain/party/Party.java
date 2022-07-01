package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Party {
    protected ArrayList<Character> charactersList;

    public Party() {
        this.charactersList = new ArrayList<Character>();
    }

    public Party(Character[] characters) {
        this.charactersList = new ArrayList<Character>();
        for (Character character:characters) {
            this.addPartyMember(character);
        }
    }

    public void addPartyMember(Character character) {
        this.charactersList.add(character);
    }


}
