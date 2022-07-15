package com.ironhack.domain.generators;

import com.ironhack.domain.characters.warrior.Warrior;
import com.ironhack.domain.characters.wizard.Wizard;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CharacterGeneratorTest {

    @org.junit.jupiter.api.Test
    void test_randomWarrior() {
        Warrior w = CharacterGenerator.randomWarrior();
        assertEquals(true, w.isAlive());
        System.out.println(w.getName()+ " is living now");
    }

    @org.junit.jupiter.api.Test
    void test_writtenWarrior() throws IOException {
        Warrior w = CharacterGenerator.writtenWarrior();
        assertEquals(true, w.isAlive());
        System.out.println(w.getName()+ " is living now with health as: " + w.getCurrentStats().getHp());
    }

    @org.junit.jupiter.api.Test
    void test_randomWizard() {
        Wizard w = CharacterGenerator.randomWizard();
        assertEquals(true, w.isAlive());
        System.out.println(w.getName()+ " is living now");
    }

    @org.junit.jupiter.api.Test
    void test_writtenWizard() throws IOException {
        Wizard w = CharacterGenerator.writtenWizard();
        assertEquals(true, w.isAlive());
        System.out.println(w.getName()+ " is living now with health as: " + w.getCurrentStats().getHp());
    }
}