package Life.Creatures.Ant;

import Life.Creatures.Creatures;
import Life.Creatures.GenerateRandomCoordinate;


public class Drones extends Creatures {

    private boolean matesWithTheQueen;
    private int matingTime;

    public Drones() {
        super.setName("Drones");
        GenerateRandomCoordinate grc = new GenerateRandomCoordinate();
        super.setCoordinate(grc.getRandomNumber(), grc.getRandomNumber());
        this.setMatesWithTheQueen(false);
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
}
