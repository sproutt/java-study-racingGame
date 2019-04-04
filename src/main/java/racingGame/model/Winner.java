package racingGame.model;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    private List<Car> winnerList;
    private static int winnerPosition;

    public List<Car> makeWinners(List<Car> cars) {
        calculateWinnerPosition(cars);
        winnerList = new ArrayList<>();
        for (Car car : cars) {
            checkWinnerName(car);
        }
        return winnerList;
    }

    private void checkWinnerName(Car car) {
        if (car.getCarPosition() == winnerPosition) {
            winnerList.add(car);
        }
    }

    private void calculateWinnerPosition(List<Car> cars) {
        int tempWinnerPosition = 0;
        for (Car car : cars) {
            tempWinnerPosition = checkWinnerPosition(tempWinnerPosition, car);
        }
        winnerPosition = tempWinnerPosition;
    }

    private int checkWinnerPosition(int tempWinnerPosition, Car car) {
        if (car.getCarPosition() > tempWinnerPosition) {
            tempWinnerPosition = car.getCarPosition();
        }
        return tempWinnerPosition;
    }

}
