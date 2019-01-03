package Life;

import Life.Creatures.Creatures;

import java.util.LinkedList;
import java.util.List;

public class Life {

    private final List<Creatures> creatures = new LinkedList<>();

    public void addCreatures(Creatures creature) {
        creatures.add(creature);
    }

}
