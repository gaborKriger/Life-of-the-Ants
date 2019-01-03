package Life.Util;

import java.util.Random;

public class MyRandom {

    private static final Random random = new Random();

    public static boolean randomBoolean() {
        return random.nextBoolean();
    }

    public static int randomNumberBetween(int min, int max){
        return random.nextInt((max - min) + 1) + min;
    }

    public static char randomDirections() {
        int number = randomNumberBetween(1,4);
        if (number == 1) {
            return 'N';
        } else if (number == 2) {
            return 'E';
        } else if (number == 3) {
            return 'S';
        } else {
            return 'W';
        }
    }

}
