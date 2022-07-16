package com.ironhack;

import com.ironhack.application.Game;
import com.ironhack.domain.generators.CharacterGenerator;
import net.datafaker.Faker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CharacterGenerator.fillArrayOfNames();
        var game = new Game();
        try {
            game.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }

    }

