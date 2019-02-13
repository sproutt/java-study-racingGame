package racingGame.Service;

import racingGame.model.Car;
import racingGame.util.RacingGameUtil;

public class RacingGameResultService {

    public static String getWinners(Car[] cars) {

        return getWinnerNames(cars, getMaxNumber(cars));
    }

    public static int getMaxNumber(Car[] cars) {
        int maxNumber = cars[0].getPosition();
        for (int i = 1; i < cars.length; i++) {
            maxNumber = Math.max(maxNumber, cars[i].getPosition());
        }
        return maxNumber;
    }

    public static String getWinnerNames(Car[] cars, int maxNumber) {
        String carNames = "";
        for (int i = 0; i < cars.length; i++) {
            carNames += getWinnerName(cars[i], maxNumber);
        }
        carNames = RacingGameUtil.toWinnerPrintFormat(carNames);
        return carNames;
    }

    public static String getWinnerName(Car car, int maxNumber) {
        if (car.getPosition() == maxNumber) {
            return car.getName() + ", ";
        }
        return "";
    }
}
