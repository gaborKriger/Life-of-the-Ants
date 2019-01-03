package Life;

import Life.Creatures.Ants.Drones;
import Life.Creatures.Ants.Queen;
import Life.Creatures.Ants.Solider;
import Life.Creatures.Ants.Worker;
import Life.Creatures.Wasp.Wasp;

public class Main {

    private static void createCreatures(Life life) {
        life.addCreatures(new Queen());
        for (int i = 0; i < 5; i++) {
            life.addCreatures(new Solider());
            life.addCreatures(new Worker());
            life.addCreatures(new Drones());
        }
        life.addCreatures(new Wasp());
    }

    public static void main(String[] args) {

        Life life = new Life();
        createCreatures(life);
    }

}
