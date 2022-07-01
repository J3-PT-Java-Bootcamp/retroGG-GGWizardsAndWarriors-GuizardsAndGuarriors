import src.Warrior;
import src.Wizard;

import java.util.ArrayList;

public class Battle {

    private Party party1;
    private Party party2;
    private ArrayList<Character> graveyard;

    public Battle(Party party1, Party party2) {
        this.party1 = party1;
        this.party2 = party2;
        graveyard = new ArrayList<>();
    }

    public void start() {
        System.out.println("The battle has started!");

        int turn = 1;

        while(!isFinished()) {
            System.out.println("Turn " + turn);

            for(Wizard wizard : party1.getWizards()) {
                Character target = getRandomCharacter(party2);
                int damage = wizard.getIntelligence();

                System.out.println(wizard.getName() + " attacks " + target.getName() + " for " + damage + " damage!");
                target.setHp(target.getHp() - damage);

                checkDeath(target);
            }

            for(Warrior warrior : party1.getWarriors()) {
                Character target = getRandomCharacter(party2);
                int damage = warrior.getStrength();

                System.out.println(warrior.getName() + " attacks " + target.getName() + " for " + damage + " damage!");
                target.setHp(target.getHp() - damage);

                checkDeath(target);
            }

            turn++;
        }

        System.out.println("The battle has ended!");

        if(party1.getWizards().size() > 0) {
            System.out.println("Party 1 has won the battle!");
        } else {
            System.out.println("Party 2 has won the battle!");
        }
    }

    private boolean isFinished() {
        return party1.getWizards().size() == 0 || party2.getWizards().size() == 0;
    }

    private void checkDeath(Character character) {
        if(character.getHp() <= 0) {
            System.out.println(character.getName() + " has died!");

            if(character instanceof Wizard) {
                party1.getWizards().remove(character);
            } else if(character instanceof Warrior) {
                party1.getWarriors().remove(character);
            }

            graveyard.add(character);
        }
    }

    private Character getRandomCharacter(Party party) {
        ArrayList<Character> characters = new ArrayList<>();
        characters.addAll(party.getWizards());
        characters.addAll(party.getWarriors());

        int index = (int)(Math.random() * characters.size());
        return characters.get(index);
    }
}

public class Main {

    public static void main(String[] args) {
        Party party1 = new Party();
        Party party2 = new Party();

        for(int i = 0; i < 5; i++) {
            party1.addWizard(new Wizard("Wizard " + i, 100, 10, 1, 10, 1));
            party1.addWarrior(new Warrior("Warrior " + i, 200, 50, 10, 10, 1));
        }

        for(int i = 0; i < 5; i++) {
            party2.addWizard(new Wizard("Wizard " + i, 100, 10, 1, 10, 1));
            party2.addWarrior(new Warrior("Warrior " + i, 200, 50, 10, 10, 1));
        }

        Battle battle = new Battle(party1, party2);
        battle.start();
    }
}
