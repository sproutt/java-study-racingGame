package racingGame.model;

import calculator.Calculator;

public class CarDto {

    private String name;
    private int speed;
    private int position;

    public CarDto(String name) {
        this.name = name;
        this.speed = 1;
        this.position = 0;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
