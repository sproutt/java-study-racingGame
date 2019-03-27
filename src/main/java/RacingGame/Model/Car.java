package RacingGame.Model;

import RacingGame.Util.*;

public class Car {
    final static int MOVE_RESTICTION = 4;

    private int carPosition = 0;

    public int getCarPosition() {
        return carPosition;
    }


    public int moveTry(int numTry) {
        for (int i = 0; i < numTry; i++) {
            moveCheck();
        }
        return carPosition;
    }

    private int moveCheck() {
        Utils utils = new Utils();
        if (utils.randomGenerator() >= MOVE_RESTICTION) {
            return carPosition++;
        }
        return carPosition;
    }
}