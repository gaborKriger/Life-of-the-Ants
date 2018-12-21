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

        System.out.println();

        Solider solider = new Solider();
        System.out.println("Solider name: " + solider.getName());
        System.out.println("Solider coordinate: " + solider.getCoordinate());

        System.out.println();

        Drones drones = new Drones();
        System.out.println("Drones name: " + drones.getName());
        System.out.println("Drones coordinate" + drones.getCoordinate());
    }
}
