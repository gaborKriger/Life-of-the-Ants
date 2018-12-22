package Life.Creatures;

import java.util.HashMap;
import java.util.Map;


public class Creatures {

    private String name;
    private Map<String, Integer> coordinate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(int x, int y) {
        Map<String, Integer> coordinate = new HashMap<>();
        coordinate.put("x", x);
        coordinate.put("y", y);
        this.coordinate = coordinate;
    }
}
