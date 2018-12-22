package Life.Creatures.Ant;

import Life.Creatures.Creatures;
import Life.Creatures.GenerateRandomCoordinate;


public class Worker extends Creatures {

    private boolean canMove;

    public Worker() {
        super.setName("Worker");
        GenerateRandomCoordinate grc = new GenerateRandomCoordinate();
        super.setCoordinate(grc.getRandomNumber(),grc.getRandomNumber());
        this.setCanMove(true);
    }

    public boolean isCanMove() {
        return canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }
}
