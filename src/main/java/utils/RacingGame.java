package utils;

import domain.Car;

public class RacingGame {
    private int time;
    private int[] carPositions;
    private Car car;
    private int FOWARD_NUMBER = 4;

    public RacingGame(int time, int numberOfCars) {
        this.time = time;
        carPositions = new int[numberOfCars];
    }

    public boolean isFoward() {
        int number = RandomValueGenerator.getRandomNumber(10);
        if (number < FOWARD_NUMBER) return false;
        return true;
    }

    public int race() {
        car = new Car();
        for (int i = 0; i < time; i++) {
            if (isFoward()) car.move();
        }
        return car.getCarPosition();
    }

    public int[] startGame() {
        for (int i = 0; i < carPositions.length; i++) {
            carPositions[i] = race();
        }
        return carPositions;
    }
}
