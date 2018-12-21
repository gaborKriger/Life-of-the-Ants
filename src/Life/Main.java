package Life;

import Life.Creatures.Ant.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> creatures = new ArrayList<>();
        createAnts(creatures);
        System.out.println(creatures);

    }

    private static void createAnts(List<Object> creatures) {
        Queen queen = new Queen();
        creatures.add(queen);
        System.out.println("Queen name: " + queen.getName());
        System.out.println("Queen coordinate: " + queen.getCoordinate());
        System.out.println("Queen is mating mood: " + queen.isMatingMood());

        System.out.println();

        Worker worker = new Worker();
        creatures.add(worker);
        System.out.println("Worker name: " + worker.getName());
        System.out.println("Worker coordinate: " + worker.getCoordinate());

        System.out.println();

        Solider solider = new Solider();
        creatures.add(solider);
        System.out.println("Solider name: " + solider.getName());
        System.out.println("Solider coordinate: " + solider.getCoordinate());

        System.out.println();

        Drones drones = new Drones();
        creatures.add(drones);
        System.out.println("Drones name: " + drones.getName());
        System.out.println("Drones coordinate" + drones.getCoordinate());
        System.out.println("Drones mating with the queen: " + drones.isMatesWithTheQueen());
        System.out.println("Drones mating time : " + drones.getMatingTime());
    }
}
