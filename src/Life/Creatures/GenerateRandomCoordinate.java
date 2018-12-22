package Life.Creatures;

import java.util.Random;

public class GenerateRandomCoordinate {

    public static int getRandomNumber(){
        int max = 99;
        int min = -99
                ;
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static char getRandomDirection() {
        int max = 4;
        int min = 1;

        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1) + min;

        if (randomNumber == 1) {
            return 'N';
        } else if (randomNumber == 2) {
            return 'E';
        } else if (randomNumber == 3) {
            return 'W';
        } else {
            return 'S';
        }
    }
}
