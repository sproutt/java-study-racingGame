package racingGame.model;

import racingGame.util.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars;
    private List<Car> winnerList;
    private static int MOVE_RESTRICTION = 4;
    private static int winnerPosition;


    public void settingCar(String players) {
        cars = new ArrayList<>();
        for (int i = 0; i < countPlayersName(players).length; i++) {
            Car car = new Car();
            cars.add(car);
            cars.get(i).inputPlayerName(splitPlayersName(players, i));
        }
    }

    private String[] countPlayersName(String players) {
        String[] names = players.split(",");
        return names;
    }

    private String splitPlayersName(String players, int index) {
        String[] names = players.split(",");
        return names[index];
    }


    public List<Car> tryAllCarGame(int numberOfTry) {
        for (Car car : cars) {
            tryEachCarGame(car, numberOfTry);
        }
        return cars;
    }

    private void tryEachCarGame(Car car, int numberOfTry) {
        for (int i = 0; i < numberOfTry; i++) {
            move(car);
        }
    }

    private void move(Car car) {
        if (isMove()) {
            car.move();
        }
    }

    private boolean isMove() {
        if (RandomGenerator.randomGenerator() >= MOVE_RESTRICTION) {
            return true;
        }
        return false;
    }

    public List<Car> makeWinners() {
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