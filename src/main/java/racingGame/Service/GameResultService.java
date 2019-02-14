package racingGame.Service;

import racingGame.model.CarDto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GameResultService {
    private static final char TRACE = '-';

    private CarDto[] carDtos;

    public GameResultService(CarDto[] carDtos) {
        this.carDtos = carDtos;
    }

    public String[] getResults() {
        String[] results = {getTraces(), getWinners(getMaxNumber(carDtos))};
        return results;
    }

    public int getMaxNumber(CarDto[] carDtos) {

        return Arrays.stream(carDtos).max((x,y)->x.getPosition() - y.getPosition()).get().getPosition();
    }

    public String getWinners(int maxNumber) {

        String[] winners = Arrays.stream(carDtos).filter(car->isWinner(car, maxNumber)).map(CarDto::getName).toArray(String[]::new);


        return toWinnerPrintFormat(winners);
    }

    public boolean isWinner(CarDto carDto, int maxNumber) {
        if (carDto.getPosition() == maxNumber) {
            return true;
        }
        return false;
    }

    public String toWinnerPrintFormat(String[] winnerAraay) {

        return Arrays.stream(winnerAraay).collect(Collectors.joining(", "));
    }

    public String getTraces() {
        String traces = "";
        for (int i = 0; i < carDtos.length; i++) {
            traces += carDtos[i].getName() + " : ";
            traces += getTrace(carDtos[i].getPosition());
        }
        return traces + "\n";
    }

    private String getTrace(int traceCount) {
        String trace = "";
        for (int i = 0; i < traceCount; i++) {
            trace += TRACE;
        }
        return trace + "\n";
    }
}
