package Life.Creatures.Ant;

import Life.Creatures.Creatures;


public class Queen extends Creatures {

    private boolean matingMood;

    public Queen() {
        super.setName("Queen");
        super.setCoordinate(0,0);
        this.setMatingMood(false);
    }

    public boolean isMatingMood() {
        return matingMood;
    }

    public void setMatingMood(boolean matingMood) {
        this.matingMood = matingMood;
    }
}
