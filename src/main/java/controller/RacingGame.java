package controller;

import model.Car;
import utils.RandomValueGenerator;

public class RacingGame {
    private final int MOVE_CONDITION = 4;
    private boolean status = false;
    private Car[] cars;

    public void set(int numberOfCars){
        cars = new Car[numberOfCars];

        for(int i = 0; i < numberOfCars; i++){
            cars[i] = new Car();
        }
    }

    public void start(int time){
        for(int i = 0; i < time; i++){
            runTurn();
        }
        status = true;
    }

    public void runTurn(){
        for(int i = 0; i < cars.length; i++){
            if(new RandomValueGenerator().getRandomNumber(1) >= MOVE_CONDITION) cars[i].move();
        }
    }

    public Car[] returnResult(){
        if(!status); //오류출력

        return cars;
    }

}
