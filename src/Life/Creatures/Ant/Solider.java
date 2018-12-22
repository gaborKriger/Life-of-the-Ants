package Life.Creatures.Ant;

import Life.Creatures.Creatures;
import Life.Creatures.GenerateRandomCoordinate;


public class Solider extends Creatures {

    private boolean detectIntruder;

    public Solider() {
        super.setName("Solider");
        GenerateRandomCoordinate grc = new GenerateRandomCoordinate();
        super.setCoordinate(grc.getRandomNumber(), grc.getRandomNumber());
        this.setDetectIntruder(false);
    }

    public boolean isDetectIntruder() {
        return detectIntruder;
    }

    public void setDetectIntruder(boolean detectIntruder) {
        this.detectIntruder = detectIntruder;
    }
}
