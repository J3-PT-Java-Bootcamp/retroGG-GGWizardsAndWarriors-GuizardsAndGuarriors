package src.domain.characters.warrior;

import src.domain.characters.Character;
import src.domain.characters.warrior.stats.WarriorStats;

public class Warrior extends Character {

    public Warrior(int id, String name, WarriorStats stats, Boolean isAlive) {
        super(id, name, stats, isAlive);
    }
}
