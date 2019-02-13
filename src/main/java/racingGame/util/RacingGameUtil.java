package racingGame.util;

import racingGame.model.Car;

import java.util.Random;

public class RacingGameUtil {
    private static final int MOVE_BOUNDARY = 4;
    private static final int RANDOM_MAX = 10;

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(RANDOM_MAX);
    }

    public static boolean isMove(int randomNumber) {
        if (randomNumber >= MOVE_BOUNDARY) {
            return true;
        }
        return false;
    }

    public static String toWinnerPrintFormat(String rawWinnerName) {
        return rawWinnerName.substring(0, rawWinnerName.length() - 2);
    }

}
