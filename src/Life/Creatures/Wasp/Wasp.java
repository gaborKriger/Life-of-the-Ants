package Life.Creatures.Wasp;

import Life.Creatures.Creatures;

import static Life.Util.MyRandom.randomBoolean;
import static Life.Util.MyRandom.randomNumberBetween;

public class Wasp extends Creatures {

    private boolean visibility;

    public Wasp() {
        super.setName("Wasp");
        super.setCoordinate(randomNumberBetween(-99,99),randomNumberBetween(-99,99));
        this.visibility = randomBoolean();
    }

    @Override
    public void prepareNextSecond() {

    }
}
