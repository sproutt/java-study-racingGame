package domain;

import dto.CarDTO;

public class Car {

    private String name;
    private int distance;

    public Car(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public int move() {
        return this.distance++;
    }

    public CarDTO toCarDTO() {
        return new CarDTO(name, distance);
    }
}
