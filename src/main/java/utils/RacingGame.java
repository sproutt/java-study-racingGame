package utils;

import domain.Car;

public class RacingGame {
    private int time;
    private int FOWARD_NUMBER = 4;

    public RacingGame(int time) {
        this.time = time;
    }

    public Car[] setCars(Car[] cars, String[] names) {
        for(int i = 0; i < names.length; i++) {
            cars[i] = new Car(names[i]);
        }
        return cars;
    }

    public boolean isFoward() {
        int number = RandomValueGenerator.getRandomNumber(10);
        if (number < FOWARD_NUMBER) return false;
        return true;
    }

    public void race(Car car) {
        for (int i = 0; i < time; i++) {
            if (isFoward()) car.move();
        }
    }

    public Car[] startGame(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
             race(cars[i]);
        }
        return cars;
    }

    public  String[] splitName(String name) {
        return name.split(",");
    }

    public int getNumberOfCars(String[] names) {
        return names.length;
    }

    public
}
