package Life.Creatures.Ant;

import Life.Creatures.Creatures;
import Life.Creatures.Move;

import static Life.Creatures.GenerateRandomCoordinate.getRandomDirection;
import static Life.Creatures.GenerateRandomCoordinate.getRandomNumber;


public class Solider extends Creatures implements Move {

    private boolean detectIntruder;

    public Solider() {
        super.setName("Solider");
        super.setCoordinate(getRandomNumber(), getRandomNumber());
        this.setDetectIntruder(false);
    }

    public boolean isDetectIntruder() {
        return detectIntruder;
    }

    public void setDetectIntruder(boolean detectIntruder) {
        this.detectIntruder = detectIntruder;
    }

    @Override
    public void moving() {
        char direction = getRandomDirection();
        int x = super.getCoordinate().get("x");
        int y = super.getCoordinate().get("y");

        if ((direction == 'N') && ((super.getCoordinate().get("y") + 1) <= 100))  {
            super.setCoordinate(x, y + 1);
        } else if ((direction == 'E') && ((super.getCoordinate().get("x") + 1) <= 100)) {
            super.setCoordinate(x + 1, y);
        } else if ((direction == 'W') && ((super.getCoordinate().get("x") -1) >= -100)) {
            super.setCoordinate(x - 1 ,y);
        }else if ((direction == 'S') && ((super.getCoordinate().get("y") -1) >= -100)) {
            super.setCoordinate(x,y - 1);
        } else {
            moving();
        }
    }
}
