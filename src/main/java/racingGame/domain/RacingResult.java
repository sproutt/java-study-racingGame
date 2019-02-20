package racingGame.domain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class RacingResult {
    private static final char TRACE = '-';

    Car[] cars;

    public RacingResult(Car[] cars) {
        this.cars = cars;
    }

    public String[] getResults() {
        String[] results = {getTraces(), getWinners(getMaxNumber(cars))};

        return results;
    }

    public int getMaxNumber(Car[] cars) {

        return Arrays.stream(cars)
                .max(Comparator.comparingInt(Car::getPosition))
                .get().getPosition();
    }

    public String getWinners(int maxNumber) {
        String[] winners = Arrays.stream(cars)
                .filter(car -> isWinner(car, maxNumber))
                .map(Car::getName)
                .toArray(String[]::new);

        return toWinnerPrintFormat(winners);
    }

    public boolean isWinner(Car car, int maxNumber) {
        if (car.getPosition() == maxNumber) {

            return true;
        }

        return false;
    }

    public String toWinnerPrintFormat(String[] winnerAraay) {

        return String.join(", ", winnerAraay);
    }

    public String getTraces() {
        String traces = "";

        for (Car car : cars) {
            traces += car.getName() + " : ";
            traces += getTrace(car.getPosition());
        }

        return traces + "\n";
    }

    private String getTrace(int traceCount) {
        String trace = "";

        for (int traceNumber = 0; traceNumber < traceCount; traceNumber++) {
            trace += TRACE;
        }

        return trace + "\n";
    }
}
