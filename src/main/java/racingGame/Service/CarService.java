package racingGame.Service;

import racingGame.model.CarDto;
import racingGame.util.RacingGameUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CarService {

    public static CarDto[] makeCars(String[] carNames) {

        return IntStream.range(0, carNames.length)
                .mapToObj(i -> new CarDto(carNames[i]))
                .toArray(CarDto[]::new);
    }

    public static void move(CarDto carDto, int randomNumber) {
        if (RacingGameUtil.isMove(randomNumber)) {
            carDto.setPosition(carDto.getPosition() + carDto.getSpeed());
        }
    }

}
