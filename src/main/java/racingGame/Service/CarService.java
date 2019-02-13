package racingGame.Service;

import racingGame.model.Car;
import racingGame.util.RacingGameUtil;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CarService {

    public static Car[] makeCars(String[] carNames) {

        return IntStream.range(0, carNames.length)
                .mapToObj(i -> new Car(carNames[i]))
                .toArray(Car[]::new);
    }

    public static void moveCars(Car[] cars) {

        Arrays.asList(cars).stream()
                .forEach(car -> move(car));
    }

    public static void move(Car car) {
        if (RacingGameUtil.isMove(RacingGameUtil.getRandomNumber())) {
            car.move();
        }
    }

    public static String findWinners(Car[] cars) {
        String winners = getWinnerNames(cars, getMaxNumber(cars));
    }

    public int getMaxNumber(Car[] cars) {
        int maxNumber = cars[0].getPosition();
        for (int i = 1; i < cars.length; i++) {
            maxNumber = Math.max(maxNumber, cars[i].getPosition());
        }
        return maxNumber;
    }

    public String getWinnerNames(Car[] cars, int maxNumber) {
        String carNames = "";
        for (int i = 0; i < cars.length; i++) {
            carNames += getWinnerName(cars[i], maxNumber);
        }
        carNames = RacingGameUtil.toWinnerPrintFormat(carNames);
        return carNames;
    }

    public String getWinnerName(Car car, int maxNumber) {
        if (car.getPosition() == maxNumber) {
            return car.getName() + ", ";
        }
        return "";
    }
}
