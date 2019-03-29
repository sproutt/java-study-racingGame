package racingGame.util;

import java.util.Random;

public class RandomGenerator {
    private static final int MAX_BOUNDARY = 10;

    public static int randomGenerator() {
        Random random = new Random();
        return random.nextInt(MAX_BOUNDARY);
    }
}
