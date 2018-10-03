package utils;

import java.util.Random;

public class RandomValueGenerator {

    public static int makeRandomNumber(int boundNumber, int delayTime) {
        getSleep(delayTime);
        long seed = System.currentTimeMillis();
        Random randomNumber = new Random(seed);
        return randomNumber.nextInt(boundNumber);
    }

    // 난수 중복 방지용 메소드
    private static void getSleep(int delayTime) {
        try {
            Thread.sleep(delayTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
