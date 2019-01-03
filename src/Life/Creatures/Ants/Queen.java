package Life.Creatures.Ants;

import Life.Creatures.Creatures;
import Life.Life;

import static Life.Util.MyRandom.randomBoolean;

public class Queen extends Creatures {

    private boolean matingMood;
    private int matingTime;
    private int matingSpirit;

    public Queen() {
        setName("Ant - Queen");
        setCoordinate(0,0);
        matingMood = randomBoolean();
    }

    @Override
    public void prepareNextSecond(Life life) {
    }
}
