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

    public void setCars(String carsNameString) {
        String[] carsName = carsNameString.split(",");
        cars = new ArrayList<>();

        for (int i = 0; i < carsName.length; i++) {
            cars.add(new Car(carsName[i]));
        }
    }

    public void start(int trials) {
        for (int i = 0; i < trials; i++) {
            turn();
        }
    }

    private void turn() {
        for (int i = 0; i < cars.size(); i++) {
            moveCar(RandomValueGenerator.makeRandomNumber(BOUND_NUMBER, DELAY_TIME),i);
        }
    }

    private void moveCar(int randomValue,int index) {
        if (randomValue >= MOVE_CONDITION_NUMBER) {
            cars.get(index).move();
        }
    }

    public String getWinner() {
        return makeWinnersString(sortCars());
    }

    private List sortCars() {
        List<Car> sortedCars = new ArrayList<>(cars);
        Collections.sort(sortedCars);
        return sortedCars;
    }

    public String makeWinnersString(List<Car> sortedCars) {
        StringBuilder winnersRankString = new StringBuilder();
        winnersRankString.append(sortedCars.get(0).getCarName());

        for (int index = 1; index < sortedCars.size(); index++) {
            if (!isSamePosition(sortedCars.get(0), sortedCars.get(index))) {
                break;
            }
            winnersRankString.append(", ").append(sortedCars.get(index).getCarName());
        }
        return winnersRankString.toString();
    }

    private boolean isSamePosition(Car firstCar, Car i) {
        return firstCar.getCarPosition() == i.getCarPosition();
    }

    public List getCars() {
        return cars;
    }
}

