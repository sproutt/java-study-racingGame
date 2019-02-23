package racingGame.domain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class RacingResult {
    private static final char MARK = '-';

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

        return Arrays.stream(cars)
                .map(this::getCarTraceRecord)
                .collect(Collectors.joining());
    }

    private String getCarTraceRecord(Car car) {
        return new StringBuffer()
                .append(car.getName())
                .append(" : ")
                .append(getTrace(car.getPosition()))
                .append("\n")
                .toString();
    }

    private String getTrace(int traceCount) {
        StringBuffer trace = new StringBuffer();

        for (int traceNumber = 0; traceNumber < traceCount; traceNumber++) {
            trace.append(MARK);
        }

        return trace.toString();
    }
}
