import utils.RandomValueGenerator;

import java.util.ArrayList;
import java.util.List;

public class RacingGameController {
    private static final int MOVE_CONDITION_NUMBER = 4;
    private static final int BOUND_NUMBER = 10;
    private static final int DELAY_TIME = 200;
    private List carList;
    private Car car;

    public void setCars(int numberOfCars, int trials) {
        carList = new ArrayList();
        for (int i = 0; i < numberOfCars; i++) {
            car = new Car();
            tryMove(trials);
            carList.add(car);
        }
    }

    private void tryMove(int trials) {
        for (int i = 0; i < trials; i++) {
            int number = RandomValueGenerator.makeRandomNumber(BOUND_NUMBER, DELAY_TIME);
            checkMoveCondition(number);
        }
    }

    private void checkMoveCondition(int number) {
        if (number >= MOVE_CONDITION_NUMBER) {
            car.move();
        }
    }

    public List getCars() {
        return carList;
    }
}
