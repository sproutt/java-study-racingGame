package utils;

import java.util.Random;

public class RandomValueGenerator {
    private static Random random = new Random();

    public static int getRandomNumber() {
        int randomNumber = random.nextInt(10);
        return randomNumber;
    }
}
