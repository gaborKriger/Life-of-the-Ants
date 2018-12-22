package Life.Creatures.Ant;

import Life.Creatures.Creatures;
import Life.Creatures.Move;

import static Life.Creatures.GenerateRandomCoordinate.getRandomDirection;
import static Life.Creatures.GenerateRandomCoordinate.getRandomNumber;


public class Worker extends Creatures implements Move {

    private char lastDirectionMove;
    private boolean canMove;

    public Worker() {
        super.setName("Worker");
        super.setCoordinate(getRandomNumber(),getRandomNumber());
        this.setCanMove(true);
    }

    public char getLastDirectionMove() {
        return lastDirectionMove;
    }

    public void setLastDirectionMove(char lastDirectionMove) {
        this.lastDirectionMove = lastDirectionMove;
    }

    public boolean isCanMove() {
        return canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    @Override
    public void moving() {
        char lastDirection = getLastDirectionMove();
        int x = super.getCoordinate().get("x");
        int y = super.getCoordinate().get("y");

        if (lastDirection == 'N') {
            super.setCoordinate(x + 1, y);
            setLastDirectionMove('E');
        } else if (lastDirection == 'E') {
            super.setCoordinate(x,y - 1);
            setLastDirectionMove('S');
        } else if (lastDirection == 'S') {
            super.setCoordinate(x - 1, y);
            setLastDirectionMove('W');
        } else if (lastDirection == 'W') {
            super.setCoordinate(x, y + 1);
            setLastDirectionMove('N');
        } else {
            setLastDirectionMove(getRandomDirection());
            moving();
        }

    }
}
