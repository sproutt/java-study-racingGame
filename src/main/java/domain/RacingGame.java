package domain;

import dto.CarDto;
import utils.RandomValueGenerator;

import java.util.List;

public class RacingGame {
    private static final int FOWARD_NUMBER = 4;
    private static final int BOUND = 10;
    private int time;

    public RacingGame(int time) {
        this.time = time;
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

    public List<Car> startGame(List<Car> cars) {
        for (Car car : cars) {
            race(car);
        }
        return cars;
    }

    public List<Car> setCars(List<Car> cars, String nameOfCars) {
        String[] names = nameOfCars.split(",");
        Car car;
        for (int i = 0; i < names.length; i++) {
            car = new Car();
            new CarDto(car).setName(names[i]);
            cars.add(car);
        }
        return cars;
    }
}
