package com.econo.racingGame.controller;

import com.econo.racingGame.model.Car;
import com.econo.racingGame.view.InputView;
import com.econo.racingGame.view.ResultView;

import java.util.Random;

public class RacingGame {

    private final static int MOVE_BOUNDARY = 4;
    private final static int GO = 1;
    private final static int STOP = 0;

    public Car[] makeCars(int carNumber,int tryNumber){
        Car[] cars = new Car[carNumber];
        for(int i = 0;i<cars.length;i++){
            cars[i] = new Car();
            cars[i].setMoveDistance(returnDistance(tryNumber));
        }
        return cars;
    }

    public int returnDistance(int tryNumber){
        int distance = 0;
        for(int i =0;i<tryNumber;i++){
            Random random = new Random();
            int randomNumber = random.nextInt(10);
            distance = distance + checkRandomNumber(randomNumber);
        }
        return distance;
    }

    public int checkRandomNumber(int randomNumber){
        if(randomNumber>=MOVE_BOUNDARY){
            return GO;
        }
        return STOP;
    }

    public void playGame(){
        ResultView.printResult(makeCars(InputView.carNumber(),InputView.tryNumber()));
    }

}