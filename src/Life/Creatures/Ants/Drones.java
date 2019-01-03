package Life.Creatures.Ants;

import Life.Creatures.Creatures;

import static Life.Util.MyRandom.randomBoolean;
import static Life.Util.MyRandom.randomNumberBetween;

public class Drones extends Creatures {

    private static int counter = 1;
    private boolean canMove;
    private boolean headToTheQueen;

    public Drones() {
        super.setName("Drones " + counter++);
        super.setCoordinate(randomNumberBetween(-99,99),randomNumberBetween(-99,99));
        this.headToTheQueen = randomBoolean();
    }

    @Override
    public void prepareNextSecond() {

    }
}
