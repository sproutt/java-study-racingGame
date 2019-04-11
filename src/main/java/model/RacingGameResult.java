package model;

import java.util.List;

public class RacingGameResult {

    private List<Car> cars;

    RacingGameResult(List<Car> cars){
        this.cars = cars;
    }
    private int getMaxRecord() {
        int maxRecord = -1;
        for (Car car : cars) {
            maxRecord = car.checkTopScore(maxRecord);
        }
        return maxRecord;
    }

    public String showWinner(List<Car> cars){ //이름 받아오기
        int maxRecord = getMaxRecord();
        StringBuffer winner = new StringBuffer();
        for (Car car : cars){
            winner.append(car.getWinnerCarName(maxRecord));
        }
        return winner.toString();
    }
}
