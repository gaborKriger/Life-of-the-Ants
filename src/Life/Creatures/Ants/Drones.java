package Life.Creatures.Ants;

import Life.Creatures.Creatures;
import Life.Life;

import static Life.Util.MyRandom.randomBoolean;
import static Life.Util.MyRandom.randomNumberBetween;

public class Drones extends Creatures {

    private static int counter = 1;
    private boolean canMove;
    private boolean headToTheQueen;

    public Drones() {
        setName("Drones " + counter++);
        setCoordinate(randomNumberBetween(-99,99),randomNumberBetween(-99,99));
        headToTheQueen = randomBoolean();
    }

    @Override
    public void prepareNextSecond(Life life) {
        canMove = life.isAntCanMove();
    }
}
