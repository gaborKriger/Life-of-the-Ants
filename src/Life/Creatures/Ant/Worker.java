package Life.Creatures.Ant;

import Life.Creatures.Creatures;
import Life.Creatures.Move;

import static Life.Creatures.GenerateRandomCoordinate.getRandomNumber;


public class Worker extends Creatures implements Move {

    private boolean canMove;

    public Worker() {
        super.setName("Worker");
        super.setCoordinate(getRandomNumber(),getRandomNumber());
        this.setCanMove(true);
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
