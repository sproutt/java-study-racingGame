package racingGame.model;

import calculator.Calculator;

public class Car {
    private int speed;
    private int position;

    public Car() {
        System.out.println("생성자실행");
        this.speed = 1;
        this.position = 0;
    }

    public void move() {
        this.position += this.speed;
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
}
