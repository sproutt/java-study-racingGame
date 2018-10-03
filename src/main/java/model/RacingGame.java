package model;

import utils.RandomValueGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RacingGame {
    private static final int MOVE_CONDITION_NUMBER = 4;
    private static final int BOUND_NUMBER = 10;
    private static final int DELAY_TIME = 200;
    private List<Car> cars;
    private Car car;

    public void setCars(String carsNameString, int trials) {
        String[] carsName = carsNameString.split(",");
        cars = new ArrayList<>();

        for (int i = 0; i < carsName.length; i++) {
            car = new Car(carsName[i]);
            tryMove(trials);
            cars.add(car);
        }
    }

    private void tryMove(int trials) {
        for (int i = 0; i < trials; i++) {
            int number = RandomValueGenerator.makeRandomNumber(BOUND_NUMBER, DELAY_TIME);
            checkMoveCondition(number);
        }
    }

    private void checkMoveCondition(int number) {
        if (number >= MOVE_CONDITION_NUMBER) {
            car.move();
        }
    }

    public List getCars() {
        return cars;
    }

    public String getWinner() {
        List<Car> sortedCars = sortCars(cars);
        return makeWinnersString(sortedCars);
    }

    private List sortCars(List cars) {
        List<Car> sortedCars = new ArrayList<>(cars);
        Collections.sort(sortedCars);
        return sortedCars;
    }

    public String makeWinnersString(List<Car> cars) {
        StringBuilder winnersRankString = new StringBuilder();
        Car firstCar = cars.get(0);
        winnersRankString.append(firstCar.getCarName());

        for (int i = 1; i < cars.size(); i++) {
            if (firstCar.getCarPosition() != cars.get(i).getCarPosition()) {
                break;
            }
            winnersRankString.append(", ").append(cars.get(i).getCarName());
        }
        return winnersRankString.toString();
    }
}
