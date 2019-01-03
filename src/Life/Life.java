package Life;

import Life.Creatures.Creatures;
import Life.Creatures.Wasp.Wasp;

import java.util.LinkedList;
import java.util.List;

public class Life {

    private final List<Creatures> creatures = new LinkedList<>();

    private boolean waspVisibility;

    private boolean antCanMove;

    private boolean antQueenMatingMood;
    private int antQueenMatingTime;
    private int antQueenMatingSpirit;

    public void addCreatures(Creatures creature) {
        creatures.add(creature);
    }

    public void simulateLife() {
        for (int i = 0; i < 500; i++) {
            for (Creatures creature : creatures) {
                creature.prepareNextSecond(this);
                //TODO creature.move();
            }
            waspVisibility = isWaspVisibility();
            antCanMove = isAntCanMove();
        }
    }

    public boolean isWaspVisibility() {
        for (Creatures creature : creatures) {
            if (creature instanceof Wasp) {
                Wasp wasp = (Wasp) creature;
                if (wasp.isVisibility()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isAntCanMove() {
        return !waspVisibility;
    }
}
