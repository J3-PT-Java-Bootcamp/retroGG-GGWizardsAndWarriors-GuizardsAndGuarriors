package src.domain.characters.stats;

public class CurrentBaseStats {
    private HealthPoints hp;

    public CurrentBaseStats(HealthPoints hp) {
        this.hp = hp;
    }

    public HealthPoints getHp() {
        return hp;
    }

    public void setHealthPoints(HealthPoints hp) {
        this.hp = hp;
    }
}
