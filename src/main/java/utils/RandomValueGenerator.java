package utils;

import java.util.Random;

public class RandomValueGenerator {

    private static Random random = new Random();

    public static int getRandomNumber(int digit){
        return random.nextInt((int)Math.pow(10, digit));
    }
}
