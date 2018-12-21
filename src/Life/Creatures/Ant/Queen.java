package Life.Creatures.Ant;

import java.util.HashMap;
import java.util.Map;

public class Queen extends Ants {

    private boolean matingMood;

    public Queen() {
        setMatingMood(false);
        setName("Queen");
        Map<String, Integer> coordinate = new HashMap<>();
        coordinate.put("x", 0);
        coordinate.put("y", 0);
        setCoordinate(coordinate);
    }

    public boolean isMatingMood() {
        return matingMood;
    }

    private void setMatingMood(boolean matingMood) {
        this.matingMood = matingMood;
    }
}
