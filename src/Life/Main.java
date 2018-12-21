package Life;

import Life.Creatures.Ant.*;

public class Main {

    public static void main(String[] args) {
        Queen queen = new Queen();
        System.out.println("Queen name: " + queen.getName());
        System.out.println("Queen coordinate: " + queen.getCoordinate());
        System.out.println("Queen is mating mood: " + queen.isMatingMood());

        System.out.println();

        Worker worker = new Worker();
        System.out.println("Worker name: " + worker.getName());
        System.out.println("Worker coordinate: " + worker.getCoordinate());
    }
}
