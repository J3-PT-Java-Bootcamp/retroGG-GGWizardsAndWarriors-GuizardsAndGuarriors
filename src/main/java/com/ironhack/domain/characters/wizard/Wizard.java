package com.ironhack.domain.characters.wizard;


import com.ironhack.domain.characters.Character;
import com.ironhack.domain.characters.behaviours.Attacker;
import com.ironhack.domain.characters.stats.BaseStats;
import com.ironhack.domain.characters.stats.CurrentBaseStats;
import com.ironhack.domain.characters.warrior.stats.attributes.Stamina;
import com.ironhack.domain.characters.wizard.stats.WizardBaseStats;
import com.ironhack.domain.characters.wizard.stats.WizardCurrentStats;
import com.ironhack.domain.characters.wizard.stats.attributes.Mana;

public class Wizard extends Character implements Attacker {

    private final WizardBaseStats baseStats;
    private final WizardCurrentStats currentStats;


    public Wizard(int id, String name, WizardBaseStats baseStats, WizardCurrentStats currentStats, Boolean isAlive) {
        super(id, name, baseStats, currentStats, isAlive);
        this.baseStats = baseStats;
        this.currentStats = currentStats;
    }

    @Override
    public WizardBaseStats getBaseStats() {
        return baseStats;
    }

    @Override
    public WizardCurrentStats getCurrentStats() {
        return currentStats;
    }

    @Override
    public void attack() {
        int currentMana = getCurrentStats().getMana().getValue();
        int currentIntelligence = getCurrentStats().getIntelligence().getValue();
        if(currentMana >= 5) {
            int damage = currentIntelligence;
            getCurrentStats().setMana(new Mana(currentMana - 5));;
            System.out.println("Fireball: Total damage is " + damage);
        } else{
            int damage = 2;
            getCurrentStats().setMana(new Mana(currentMana + 1));;
            System.out.println("Staff Hit: Total damage is " + damage);
        }

    }
}
