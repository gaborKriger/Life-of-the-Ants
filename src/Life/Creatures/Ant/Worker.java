package Life.Creatures.Ant;


public class Worker extends Ants {

    public Worker() {
        setName("Worker");
        setCoordinate(getFirstRandomCoordinate());
    }
}
