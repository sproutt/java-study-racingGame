package model;

public class Car implements Comparable<Car>{
    private int carPosition;
    private String carName;

    public Car(String carName, int carPosition) {
        this.carName = carName;
        this.carPosition = carPosition;
    }

    public Car(String carName){
        this(carName, 0);
    }

    public String getCarName() {
        return carName;
    }

    public int getCarPosition() {
        return this.carPosition;
    }

    public int move() {
        return carPosition++;
    }

    @Override
    public int compareTo(Car o) {
        return this.carPosition >  o.carPosition ? -1: 1;
    }
}


