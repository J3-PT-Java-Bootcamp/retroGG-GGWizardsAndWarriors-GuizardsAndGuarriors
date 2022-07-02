package com.ironhack;

public class Warrior extends Character {
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

    @Override
    public void heavyAttack(){
        if(this.stamina >= 5) {
            int damage = this.strength;
            this.stamina -= 5;
            System.out.println("Heavy attack: Total damage is " + damage);
        } else{
            weakAttack();
        }
    }

    @Override
    public void weakAttack() {
        int damage = this.strength/2;
        this.stamina += 1;
        System.out.println("Weak attack: Total damage is " + damage);
    }
}
