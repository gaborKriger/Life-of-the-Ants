package Life;

import Life.Creatures.Ant.*;
import Life.Creatures.Wasp.Wasp;


public class Main {

    public static void main(String[] args) {
        constructorTest();
        soliderMoveTest();
    }

    private static void constructorTest() {

        Queen queen = new Queen();
        System.out.println("Queen name: " + queen.getName());
        System.out.println("Queen coordinate: " + queen.getCoordinate());
        System.out.println("Queen is mating mood: " + queen.isMatingMood());
        System.out.println();

        Worker worker = new Worker();
        System.out.println("Worker name: " + worker.getName());
        System.out.println("Worker coordinate: " + worker.getCoordinate());
        System.out.println("Worker is can move: " + worker.isCanMove());
        System.out.println();

        Drones drones = new Drones();
        System.out.println("Drone name: " + drones.getName());
        System.out.println("Drone coordinate: " + drones.getCoordinate());
        System.out.println("Drone is mate with Queen: " + drones.isMatesWithTheQueen());
        System.out.println("Drone mating time: " + drones.getMatingTime());
        System.out.println("Drone is can move: " + drones.isCanMove());
        System.out.println();

        Solider solider = new Solider();
        System.out.println("Solider name: " + solider.getName());
        System.out.println("Solider coordinate: " + solider.getCoordinate());
        solider.moving();
        System.out.println("Solider coordinate: " + solider.getCoordinate());
        System.out.println("Solider detect the intruder: " + solider.isDetectIntruder());
        System.out.println();

        Wasp wasp = new Wasp();
        System.out.println("Wasp name: " + wasp.getName());
        System.out.println("Wasp coordinate: " + wasp.getCoordinate());
        System.out.println("Wasp is visible: " + wasp.isVisible());
        System.out.println();

    }

    private static void soliderMoveTest() {
        Solider solider = new Solider();
        for (int i = 0; i < 100; i++) {
            System.out.println("Solider coordinate: " + solider.getCoordinate());
            solider.moving();
        }
    }

}
