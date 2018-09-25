package model;

import java.util.Random;

public class Game {
    private boolean status;
    private int time;
    private int numberOfCars;
    private Car[] cars;
    private Random random;

    public Game() {
        status = false;
        random = new Random();
    }

    public void setNumberOfCars(int numberOfCars){
        this.numberOfCars = numberOfCars;
        cars = new Car[numberOfCars];

        for(int i = 0; i < numberOfCars; i++){
            cars[i] = new Car();
        }
    }

    public void setTime(int time){
        this.time = time;
    }

    public void start(){
        for(int i = 0; i < time; i++){
            runTurn();
        }
        status = true;
    }

    public void runTurn(){
        for(int i = 0; i < numberOfCars; i++){
            if(moveConditional()){
                cars[i].move();
            }
        }
    }

    public boolean moveConditional(){
        int ranNum = random.nextInt(10);
        if(ranNum > 3) return true;

        return false;
    }

    public Car[] getCars() {
        return cars;
    }

    public boolean isEnd(){
        return status;
    }
}
