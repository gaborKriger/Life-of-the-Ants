package Life.Creatures.Ant;

import java.util.HashMap;

public class Solider extends Ants implements Moving {

    public Solider() {
        setName("Solider");
        setCoordinate(getFirstRandomCoordinate());
    }

    @Override
    public void moving(HashMap<String, Integer> coordinate) {
        setCoordinate(coordinate);
    }
}
