package utils;

import java.util.Random;

public class RandomValueGenerator {

    private Random random;

    public RandomValueGenerator() {
        this.random = new Random();
    }

    public int getRandomNumber(int digit){
        return random.nextInt((int)Math.pow(10, digit));
    }
}
