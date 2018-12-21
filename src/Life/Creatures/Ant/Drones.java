package Life.Creatures.Ant;


public class Drones extends Ants {
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

    private void setMatesWithTheQueen(boolean matesWithTheQueen) {
        this.matesWithTheQueen = matesWithTheQueen;
    }

    public int getMatingTime() {
        return matingTime;
    }

    public void setMatingTime(int matingTime) {
        this.matingTime = matingTime;
    }
}
