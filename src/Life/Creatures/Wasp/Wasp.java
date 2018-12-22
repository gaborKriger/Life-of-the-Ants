package Life.Creatures.Wasp;

import Life.Creatures.Creatures;
import Life.Creatures.GenerateRandomCoordinate;
import Life.Creatures.Move;


public class Wasp extends Creatures implements Move {

    private boolean Visible;

    public Wasp() {
        super.setName("Wasp");
        GenerateRandomCoordinate grc = new GenerateRandomCoordinate();
        super.setCoordinate(grc.getRandomNumber(), grc.getRandomNumber());
        this.setVisible(false);
    }

    public boolean isVisible() {
        return Visible;
    }

    public void setVisible(boolean visible) {
        Visible = visible;
    }

    @Override
    public void moving() {

    }
}
