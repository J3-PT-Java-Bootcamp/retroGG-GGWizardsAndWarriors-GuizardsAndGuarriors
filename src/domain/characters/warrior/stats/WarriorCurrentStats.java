package src.domain.characters.warrior.stats;

public class WarriorCurrentStats extends WarriorStats {

    public WarriorCurrentStats(WarriorHealthPoints hp, Stamina stamina, Strength strength) {
        super(hp, stamina, strength);
    }

    public void setHp(WarriorHealthPoints hp) {
        this.hp = hp;
    }

    public void setStamina(Stamina stamina) {
        this.stamina = stamina;
    }

    public void setStrength(Strength strength) {
        this.strength = strength;
    }
}
