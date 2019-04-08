package racingGame.model;

import java.util.ArrayList;
import java.util.List;

public class WinnerGenerator {
    private List<Car> winnerList = new ArrayList<>();

    public List<Car> makeWinners(List<Car> cars) {
        for (Car car : cars) {
           addWinnerName(car);
        }
        return winnerList;
    }

    private void addWinnerName(Car car) {
        if (car.settingWinner()) {
            winnerList.add(car);
        }
    }
}
