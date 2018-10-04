package domain;

import utils.RandomValueGenerator;

public class RacingGame {
    private int time;
    private static final int FOWARD_NUMBER = 4;
    private static final int BOUND = 10;

    public RacingGame(int time) {
        this.time = time;
    }

    public Car[] setCars(Car[] cars, String nameOfCars) {
        String[] names = nameOfCars.split(",");
        for (int i = 0; i < names.length; i++) {
            cars[i] = new Car();
            cars[i].setName(names[i]);
        }
        return cars;
    }

    public boolean isFoward() {
        if (RandomValueGenerator.getRandomNumber(BOUND) < FOWARD_NUMBER) return false;
        return true;
    }

    public void race(Car car) {
        for (int i = 0; i < time; i++) {
            if (isFoward()) car.move();
        }
    }

    public Car[] startGame(Car[] cars) {
        for (Car car : cars) {
            race(car);
        }
        return cars;
    }


    public int getNumberOfCars(String nameOfCars) {
        return nameOfCars.split(",").length;
    }
}
