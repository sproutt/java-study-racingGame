package dto;

import domain.Car;

public class CarDto {
    private Car car;

    public CarDto(Car car) {
        this.car = car;
    }

    public void setName(String name) {
        car.setName(name);
    }

    public String getName() {
        return car.getName();
    }

    public int getCarPosition() {
        return car.getCarPosition();
    }
}
