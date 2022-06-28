package src;

public class Warrior extends Character{
    public Warrior(int id, String name, int hp, Boolean isAlive) {
        super(id, name, hp, isAlive);
    }

    int stamina;
    int strength;

    public Warrior(int id, String name, int hp, Boolean isAlive, int stamina, int strength) {
        super(id, name, hp, isAlive);
        this.stamina = stamina;
        this.strength = strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
