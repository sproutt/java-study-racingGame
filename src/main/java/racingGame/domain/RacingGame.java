package racingGame.domain;

import racingGame.utils.RandomGenerator;

import java.util.stream.IntStream;

public class RacingGame {

    private Car[] cars;

    private static final int RANDOM_MAX = 10;
    private static final int MOVE_BOUNDARY = 4;
    private static final int SPEED = 1;

    public Car[] makeCars(String[] carNames) {
        cars = IntStream.range(0, carNames.length)
                .mapToObj(i -> new Car(carNames[i]))
                .toArray(Car[]::new);

        return cars;
    }

    public String[] play(int tryNumber) {
        for (int k = 0; k < tryNumber; k++) {
            moveCars();
        }

        return new RacingResult(cars).getResults();
    }


    public void moveCars() {
        for (Car car : cars) {
            move(car, RandomGenerator.getNumber(RANDOM_MAX));
        }
    }

    public void move(Car car, int randomNumber) {
        if (isMove(randomNumber)) {
            car.setPosition(car.getPosition() + SPEED);
        }
    }

    public boolean isMove(int randomNumber) {
        if (randomNumber >= MOVE_BOUNDARY) {

            return true;
        }

        return false;
    }

}
