package com.ironhack.domain.party;

import net.datafaker.Faker;

public class PartyBuilderRandom {

  static Faker faker = new Faker();
  private static int MAX_HP = 200;
  private static int MIN_HP = 100;
  private static int MAX_STAMINA = 50;
  private static int MIN_STAMINA = 10;
  private static int MAX_STRENGTH = 10;
  private static int MIN_STRENGTH = 1;
  private static int MAX_MANA = 50;
  private static int MIN_MANA = 10;
  private static int MAX_INTELLIGENCE = 50;
  private static int MIN_INTELLIGENCE = 1;

  private static String[] randomListName;


  public PartyBuilderRandom() {
    randomListName = fillListName(30);
  }

  public static String[] fillListName(int numElements){
    for (int i = 0; i < numElements; i++) {
      String randomName = faker.funnyName().name();
      randomListName[i] = randomName;
    }
    return randomListName;
  }


  public void getRandomCharacters() {
  }

  public static Party buildParty(int size) {
    Party party = new Party();

    for (int i = 0; i < size; i++) {
      String name = getRandomName();
    }

    int hp = getRandomInt(MAX_HP, MIN_HP);
    int stamina = getRandomInt(MAX_STAMINA, MIN_STAMINA);
    int strength = getRandomInt(MAX_STRENGTH, MIN_STRENGTH);
    int mana = getRandomInt(MAX_MANA, MIN_MANA);
    int intelligence = getRandomInt(MAX_INTELLIGENCE, MIN_INTELLIGENCE);
    return party;
  }

  public static int getRandomInt(int max, int min) {
    return (int) (Math.random() * (max - min)) + min;
  }

  private static String getRandomName() {
    int index = (int) (Math.random() * randomListName.length);
    String name = randomListName[index];

    if (nameTaken(name)) {
      name = name + " Jr.";
    }
    return name;
  }

  private static boolean nameTaken(String name) {
    for (String takenName : randomListName) {
      if (takenName.equals(name)) {
        return true;
      }
    }
    return false;
  }

}



