package Life.Creatures.Ant;

import java.util.HashMap;

public class Drones extends Ants implements Moving{

    public Drones() {
        setName("Drones");
        setCoordinate(getFirstRandomCoordinate());
    }

    @Override
    public void moving(HashMap<String, Integer> coordinate) {
        setCoordinate(coordinate);
    }
}
