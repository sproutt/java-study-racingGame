package racingGame.Service;

import racingGame.model.CarDto;
import racingGame.util.RacingGameUtil;

public class GameResultService {

    public static String getWinners(CarDto[] carDtos) {

        return getWinnerNames(carDtos, getMaxNumber(carDtos));
    }

    public static int getMaxNumber(CarDto[] carDtos) {
        int maxNumber = carDtos[0].getPosition();
        for (int i = 1; i < carDtos.length; i++) {
            maxNumber = Math.max(maxNumber, carDtos[i].getPosition());
        }

        return maxNumber;
    }

    public static String getWinnerNames(CarDto[] carDtos, int maxNumber) {
        String carNames = "";
        for (int i = 0; i < carDtos.length; i++) {
            carNames += getWinnerName(carDtos[i], maxNumber);
        }
        carNames = RacingGameUtil.toWinnerPrintFormat(carNames);
        return carNames;
    }

    public static String getWinnerName(CarDto carDto, int maxNumber) {
        if (carDto.getPosition() == maxNumber) {
            return carDto.getName() + ", ";
        }
        return "";
    }
}
