package src.domain.characters;

import src.domain.characters.stats.BaseStats;

public abstract class Character {
    int id;
    String name;
    final BaseStats baseStats;
    Boolean isAlive;

    public Character(int id, String name, BaseStats baseStats, Boolean isAlive) {
        this.id = id;
        this.name = name;
        this.baseStats = baseStats;
        this.isAlive = isAlive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }
}
