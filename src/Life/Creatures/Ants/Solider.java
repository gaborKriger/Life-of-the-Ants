package Life.Creatures.Ants;

import Life.Creatures.Creatures;
import Life.Life;

import static Life.Util.MyRandom.randomDirections;
import static Life.Util.MyRandom.randomNumberBetween;

public class Solider extends Creatures {

    private static int counter = 1;
    private boolean seeIntruder;
    private char lastMove;

    public Solider() {
        setName("Solider " + counter++);
        setCoordinate(randomNumberBetween(-99,99),randomNumberBetween(-99,99));
        lastMove = randomDirections();
    }

    @Override
    public void prepareNextSecond(Life life) {

    }
}
