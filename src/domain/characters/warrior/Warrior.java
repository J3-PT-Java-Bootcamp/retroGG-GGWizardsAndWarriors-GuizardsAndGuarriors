package src.domain.characters.warrior;

import src.domain.characters.Character;
import src.domain.characters.warrior.stats.WarriorCurrentStats;
import src.domain.characters.warrior.stats.WarriorStats;

public class Warrior extends Character {

    private final WarriorStats baseStats;
    private final WarriorCurrentStats currentStats;

    public Warrior(int id, String name, WarriorStats baseStats, WarriorCurrentStats currentStats, Boolean isAlive) {
        super(id, name, baseStats, currentStats, isAlive);
        this.baseStats = baseStats;
        this.currentStats = currentStats;
    }

    @Override
    public WarriorStats getBaseStats() {
        return baseStats;
    }

    @Override
    public WarriorCurrentStats getCurrentStats() {
        return currentStats;
    }
}
