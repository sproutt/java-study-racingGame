package utils;

import java.util.Random;

public class RandomValueGenerator {
    private static Random random;

    public RandomValueGenerator() {
        random = new Random();
    }

    public static int getRandomNumber(int bound) {
        return random.nextInt(bound);
    }
}
