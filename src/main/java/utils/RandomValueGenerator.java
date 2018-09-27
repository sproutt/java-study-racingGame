package utils;

import java.util.Random;

public class RandomValueGenerator {
    Random random = new Random();

    public int getRandomNumber() {
        int randomNumber = random.nextInt(10);
        return randomNumber;
    }
}
