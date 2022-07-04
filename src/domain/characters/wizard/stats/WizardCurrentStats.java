package src.domain.characters.wizard.stats;

public class WizardCurrentStats extends WizardStats {

    public WizardCurrentStats(WizardHealthPoints hp, Mana mana, Intelligence intelligence) {
        super(hp, mana, intelligence);
    }

    public void setWizardHealthPoints(WizardHealthPoints hp) {
        this.hp = hp;
    }

    public void setMana(Mana mana) {
        this.mana = mana;
    }

    public void intelligence(Intelligence intelligence) {
        this.intelligence = intelligence;
    }


}
