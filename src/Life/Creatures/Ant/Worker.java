package Life.Creatures.Ant;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Worker extends Ants implements Moving {

    public Worker() {
        setName("Worker");
        Map<String, Integer> coordinate = new HashMap<>();
        Random random = new Random();
        coordinate.put("x", random.nextInt((50 - (-50)) + 1) + (-50));
        coordinate.put("y", random.nextInt((50 - (-50)) + 1) + (-50));
        setCoordinate(coordinate);
    }

    @Override
    public void moving(HashMap<String, Integer> coordinate) {
        setCoordinate(coordinate);
    }
}
