package Life.Creatures.Wasp;

import Life.Creatures.Creatures;
import Life.Life;

import static Life.Util.MyRandom.randomNumberBetween;
import static Life.Util.MyRandom.tenPercentChance;

public class Wasp extends Creatures {

    private boolean visibility;

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public Wasp() {
        setName("Wasp");
        setCoordinate(randomNumberBetween(-99,99),randomNumberBetween(-99,99));
        visibility = tenPercentChance();
    }

    @Override
    public void prepareNextSecond(Life life) {
        if (!life.isWaspVisibility() && tenPercentChance()) {
            visibility = true;
            setCoordinate(randomNumberBetween(-99,99),randomNumberBetween(-99,99));
        }
    }
}
