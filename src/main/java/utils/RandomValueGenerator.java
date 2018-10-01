package utils;

import java.util.Random;

public class RandomValueGenerator {
    static final int BOUND_NUMBER = 10;
    static final int DELAY_TIME = 200;

    public static int makeRandomNumber() {
        long seed = System.currentTimeMillis();
        Random randomNumber = new Random(seed);
        return randomNumber.nextInt(BOUND_NUMBER);
    }

    // 난수 중복 방지용 메소드
    public static void getSleep() {
        try {
            Thread.sleep(DELAY_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
