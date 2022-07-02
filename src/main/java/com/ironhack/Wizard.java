package com.ironhack;

public class Wizard extends Character{

    int mana;
    int intelligence;

    public Wizard(int id, String name, int hp, Boolean isAlive, int mana, int intelligence) {
        super(id, name, hp, isAlive);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void Fireball() {
        if(this.mana >= 5) {
            int damage = this.intelligence;
            this.mana -= 5;
            System.out.println("Fireball: Total damage is " + damage);
        } else{
            staffHit();
        }
    }

    @Override
    public void staffHit() {
        int damage = 2;
        this.mana += 1;
        System.out.println("Staff Hit: Total damage is " + damage);
    }
}
