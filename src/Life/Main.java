package Life;

import Life.Creatures.Ant.*;

public class Main {

    public static void main(String[] args) {
        Queen queen = new Queen();
        System.out.println("Queen coordinate: " + queen.getCoordinate());
        System.out.println("Queen is mating mood: " + queen.isMatingMood());
    }
}
