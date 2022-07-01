import src.Wizard;

public class WizardsPartyBuilder {
    private static String[] NAMES = {"a","b","c","d","e","f"};
    //utilizar la libreria faker para generar los nombres

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

    public static Party buildParty(int size) {
        Party party = new Party();

        for(int i = 0; i < size; i++) {
            String name = getRandomName();
            int hp = getRandomInt(MAX_HP, MIN_HP);
            int stamina = getRandomInt(MAX_STAMINA, MIN_STAMINA);
            int strength = getRandomInt(MAX_STRENGTH, MIN_STRENGTH);
            int mana = getRandomInt(MAX_MANA, MIN_MANA);
            int intelligence = getRandomInt(MAX_INTELLIGENCE, MIN_INTELLIGENCE);

            party.addWizard(new Wizard(name, hp, stamina, strength, mana, intelligence));
        }

        return party;
    }

    private static String getRandomName() {
        int index = (int)(Math.random() * NAMES.length);
        String name = NAMES[index];

        if(nameTaken(name)) {
            name = name + " Jr.";
        }

        return name;
    }

    private static boolean nameTaken(String name) {
        for(String takenName : NAMES) {
            if(takenName.equals(name)) {
                return true;
            }
        }

        return false;
    }

    private static int getRandomInt(int max, int min) {
        return (int)(Math.random() * (max - min)) + min;
    }
}
