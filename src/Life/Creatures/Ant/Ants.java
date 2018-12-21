package Life.Creatures.Ant;

import java.util.Map;

abstract class Ants {
    private String name;
    private Map<String, Integer> coordinate;

    public Map<String, Integer> getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Map<String, Integer> coordinate) {
        this.coordinate = coordinate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
