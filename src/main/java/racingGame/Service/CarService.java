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
                .forEach(car -> move(car, RacingGameUtil.getRandomNumber()));
    }

    public static void move(Car car, int randomNumber) {
        if (RacingGameUtil.isMove(randomNumber)) {
            car.move();
        }
    }

}
