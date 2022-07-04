package src.domain.characters.wizard;

import src.domain.characters.Character;
import src.domain.characters.wizard.stats.WizardStats;

public class Wizard extends Character {

    public Wizard(int id, String name, WizardStats stats, Boolean isAlive) {
        super(id, name, stats, isAlive);
    }

}
