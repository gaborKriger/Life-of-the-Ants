package Life.Creatures.Ant;

import java.util.HashMap;

public class Drones extends Ants implements Moving{

    @Override
    public void moving(HashMap<String, Integer> coordinate) {
        setCoordinate(coordinate);
    }
}
