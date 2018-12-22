package Life.Creatures;

import java.util.Random;

public class GenerateRandomCoordinate {

    public int getRandomNumber(){
        int max = 99;
        int min = -99;
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
