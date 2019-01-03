package Life.Creatures.Ants;

import Life.Creatures.Creatures;

import static Life.Util.MyRandom.randomBoolean;

public class Queen extends Creatures {

    private boolean matingMood;
    private int matingTime;
    private int matingSpirit;

    public Queen() {
        super.setName("Ant - Queen");
        super.setCoordinate(0,0);
        this.matingMood = randomBoolean();
    }

    @Override
    public void prepareNextSecond() {

    }
}
