package Life.Creatures.Ant;

import java.util.Map;

abstract class Ants {

    private Map<String, Integer> coordinate;

    public Map<String, Integer> getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Map<String, Integer> coordinate) {
        this.coordinate = coordinate;
    }
}
