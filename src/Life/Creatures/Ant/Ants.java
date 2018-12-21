package Life.Creatures.Ant;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

abstract class Ants {
    private String name;
    private Map<String, Integer> coordinate;

    public Map<String, Integer> getCoordinate() {
        return coordinate;
    }

    void setCoordinate(Map<String, Integer> coordinate) {
        this.coordinate = coordinate;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Map<String, Integer> getFirstRandomCoordinate() {
        Map<String, Integer> coordinate = new HashMap<>();
        Random random = new Random();
        coordinate.put("x", random.nextInt((50 - (-50)) + 1) + (-50));
        coordinate.put("y", random.nextInt((50 - (-50)) + 1) + (-50));
        return coordinate;
    }
}
