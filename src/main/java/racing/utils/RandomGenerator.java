package racing.utils;

import java.util.Random;

public class RandomGenerator {
    private static final int BOUNDARY_NUMBER = 10;

    public static int generateNumber() {
        return new Random().nextInt(BOUNDARY_NUMBER);
    }
}