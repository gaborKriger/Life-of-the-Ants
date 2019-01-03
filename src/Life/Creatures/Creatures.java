package Life.Creatures;

import java.util.HashMap;

public abstract class Creatures {

    private String name;
    private HashMap<Character, Integer> coordinate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Character, Integer> getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(int x, int y) {
        HashMap<Character, Integer> temporaryStorage = new HashMap<>();
        temporaryStorage.put('x',x);
        temporaryStorage.put('y',y);
        this.coordinate = temporaryStorage;
    }

    public abstract void prepareNextSecond();

}
