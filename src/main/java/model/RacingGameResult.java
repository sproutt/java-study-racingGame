package model;

import java.util.ArrayList;
import java.util.List;

public class RacingGameResult {

    private List<Car> cars;
    private int topRecord;

    public RacingGameResult(List<Car> cars){
        this.cars = cars;
        setTopRecord();
    }

    private void setTopRecord() {
        topRecord = -1;
        for (Car car : cars) {
            topRecord = car.checkTopRecord(topRecord);
        }
    }

    public String getWinners(){
        List<String> winners = new ArrayList<>();
        for (Car car : cars){
            addWinner(winners, car);
        }
        return winners.toString();
    }

    private void addWinner(List<String> winners,  Car car){
        String winnerName = car.getWinnerName(topRecord);
        if(winnerName!= null){
            winners.add(winnerName);
        }
    }

    public List<String> showRecords(char trackShape, String blank){
        List<String> result = new ArrayList<>();
        for (Car car: cars){
            result.add(car.showRecord(trackShape, blank));
        }
        return result;
    }
}
