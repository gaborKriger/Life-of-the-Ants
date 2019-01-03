package Life.Creatures.Ants;

import Life.Creatures.Creatures;
import Life.Life;

import static Life.Util.MyRandom.randomNumberBetween;

public class Worker extends Creatures {

    private static int counter = 1;
    private boolean canMove;

    public Worker() {
        setName("Worker " + counter++);
        setCoordinate(randomNumberBetween(-99,99),randomNumberBetween(-99,99));
    }

    @Override
    public void prepareNextSecond(Life life) {
        canMove = life.isAntCanMove();
    }
}
