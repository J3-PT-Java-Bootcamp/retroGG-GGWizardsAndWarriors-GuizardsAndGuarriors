package src;

import java.util.ArrayList;

public class Graveyard {

    protected ArrayList<Character> deadCharactersList;

    public Graveyard() {
        this.deadCharactersList = new ArrayList<Character>();
    }

    public void addToGraveyard(Character character){
        deadCharactersList.add(character);
    }

    public void printDeads(){

        for (Character character:deadCharactersList) {

            System.out.println(character.getName() + " is resting at the graveyard");
        }
    }

    public void printLast3Deads(){

        if (deadCharactersList.size() < 3){
            System.out.println("Not enough deads to show you three, fight some more for me");
        } else if (deadCharactersList.size() >= 3 ) {
            for (int i = deadCharactersList.size(); i < deadCharactersList.size()+3; i++) {
                System.out.println(deadCharactersList.get(i).getName() + " is resting at the graveyard");
            }
        }
    }
}
