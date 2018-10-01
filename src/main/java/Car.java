import utils.RandomValueGenerator;

public class Car {
    static RandomValueGenerator random;
    static final int MOVE_CONDITION_NUMBER = 4;
    static final int MOVE = 1;
    static final int STOP = 0;
    private int carPosition;

    public int getCarPosition() {
        return this.carPosition;
    }

    public void setCarPosition(int trials) {
        carPosition = 0;
        for (int i = 0; i < trials; i++) {
            int number = random.makeRandomNumber();

            carPosition += checkMoveCondition(number);
            RandomValueGenerator.getSleep();
        }
    }

    public static int checkMoveCondition(int number) {
        if (number >= MOVE_CONDITION_NUMBER) {
            return MOVE;
        }
        return STOP;
    }
}


