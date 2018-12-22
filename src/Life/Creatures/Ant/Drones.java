package Life.Creatures.Ant;

import Life.Creatures.Creatures;
import Life.Creatures.Move;

import static Life.Creatures.GenerateRandomCoordinate.getRandomNumber;


public class Drones extends Creatures implements Move {

    private boolean matesWithTheQueen;
    private int matingTime;
    private boolean canMove;

    public Drones() {
        super.setName("Drones");
        super.setCoordinate(getRandomNumber(), getRandomNumber());
        this.setMatesWithTheQueen(false);
        this.setCanMove(true);
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

    public boolean isCanMove() {
        return canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    @Override
    public void moving() {

    }
}
