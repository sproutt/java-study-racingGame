package racingGame.utils;

import java.util.Random;

public class RandomGenerator {

    private static Random random = new Random();

    public static int getNumber(int randomMax) {

        return random.nextInt(randomMax);
    }

}
