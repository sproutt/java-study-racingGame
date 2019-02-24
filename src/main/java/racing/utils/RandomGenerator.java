package racing.utils;

import java.util.Random;

public class RandomGenerator {
    public static int generateNumber() {
        return new Random().nextInt(10);
    }
}
