package Life.Creatures.Ants;

import Life.Creatures.Creatures;

import static Life.Util.MyRandom.randomNumberBetween;

public class Worker extends Creatures {

    private static int counter = 1;
    private boolean canMove;

    public Worker() {
        super.setName("Worker " + counter++);
        super.setCoordinate(randomNumberBetween(-99,99),randomNumberBetween(-99,99));
    }

    @Override
    public void prepareNextSecond() {

    }
}
