package model;

import java.util.ArrayList;
import java.util.List;

public class RacingGameResult {

    private List<Car> cars;
    private int topRecord;

    public RacingGameResult(List<Car> cars) {
        this.cars = cars;
        setTopRecord();
    }

    private void setTopRecord() {
        topRecord = -1;
        for (Car car : cars) {
            topRecord = car.checkTopRecord(topRecord);
        }
    }

    public String getWinners() {
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            car.addWinner(winners, topRecord);
        }
        return winners.toString();
    }

    public List<String> showRecords(char trackShape, String blank) {
        List<String> result = new ArrayList<>();
        for (Car car : cars) {
            result.add(car.showRecord(trackShape, blank));
        }
        return result;
    }
}
