package Life.Creatures.Ant;

import java.util.HashMap;

public class Drones extends Ants implements Moving{
    private boolean matesWithTheQueen;
    private int matingTime;

    public Drones() {
        setName("Drones");
        setCoordinate(getFirstRandomCoordinate());
        setMatesWithTheQueen(false);
    }

    public boolean isMatesWithTheQueen() {
        return matesWithTheQueen;
    }

    public void setMatesWithTheQueen(boolean matesWithTheQueen) {
        this.matesWithTheQueen = matesWithTheQueen;
    }

    public int getMatingTime() {
        return matingTime;
    }

    public void setMatingTime(int matingTime) {
        this.matingTime = matingTime;
    }

    @Override
    public void moving(HashMap<String, Integer> coordinate) {
        setCoordinate(coordinate);
    }
}
