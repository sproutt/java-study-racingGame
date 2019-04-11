package model;

import java.util.ArrayList;
import java.util.List;

public class RacingGameResult {

    private List<Car> cars;

    public RacingGameResult(List<Car> cars){
        this.cars = cars;
    }

    private int getMaxRecord() {
        int maxRecord = -1;
        for (Car car : cars) {
            maxRecord = car.checkTopRecord(maxRecord);
        }
        return maxRecord;
    }

    public String showWinner(){
        int maxRecord = getMaxRecord();
        List<String> winners = new ArrayList<>();
        for (Car car : cars){
            addWinner(winners, maxRecord, car);
        }
        return winners.toString();
    }

    private void addWinner(List<String> winners, int maxRecord, Car car){
        String winnerName = car.getWinnerName(maxRecord);
        if(winnerName!= null){
            winners.add(winnerName);
        }
    }

    public List<String> getRecord(){
        List<String> carRecord = new ArrayList<>();
        for (Car car: cars){
            carRecord.add(car.showRecord('-', " : "));
        }
        return carRecord;
    }

}
