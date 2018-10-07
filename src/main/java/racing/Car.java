package racing;

import racing.dto.CarDTO;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return distance == car.distance &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distance);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}
