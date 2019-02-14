package racingGame.Service;

import racingGame.model.CarDto;
import racingGame.model.GameResultDto;

public class GameResultService {

    private GameResultDto gameResultDto;

    public GameResultService(){
        gameResultDto = new GameResultDto();
    }

    public static String[] getResults() {
    }

    public String getWinners(CarDto[] carDtos) {

        return getWinnerNames(carDtos, getMaxNumber(carDtos));
    }

    public int getMaxNumber(CarDto[] carDtos) {
        int maxNumber = carDtos[0].getPosition();
        for (int i = 1; i < carDtos.length; i++) {
            maxNumber = Math.max(maxNumber, carDtos[i].getPosition());
        }

        return maxNumber;
    }

    public String getWinnerNames(CarDto[] carDtos, int maxNumber) {
        String carNames = "";
        for (int i = 0; i < carDtos.length; i++) {
            carNames += getWinnerName(carDtos[i], maxNumber);
        }
        carNames = toWinnerPrintFormat(carNames);
        return carNames;
    }

    public String getWinnerName(CarDto carDto, int maxNumber) {
        if (carDto.getPosition() == maxNumber) {
            return carDto.getName() + ", ";
        }
        return "";
    }

    public static String toWinnerPrintFormat(String rawWinnerName) {
        return rawWinnerName.substring(0, rawWinnerName.length() - 2);
    }

}
