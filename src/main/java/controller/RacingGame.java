package controller;

import model.Car;
import view.InputView;
import view.ResultView;

import java.util.Random;
import java.util.Scanner;

public class RacingGame {

    private int time;
    private Car[] cars;
    private Random random;

    public RacingGame(int numberOfCar, int time) {
        cars = new Car[numberOfCar];
        this.time = time;
        random = new Random();

        for(int i = 0; i < numberOfCar; i++){
            cars[i] = new Car();
        }
    }

    public void moveCar(){
        for(int i = 0; i < cars.length; i++){
            if(tryMove()) cars[i].move();
        }
    }

    public boolean tryMove(){
        return random.nextInt() > 3 ? true : false;
    }

    public void startGame(){
        for(int i = 0; i < time; i++){
            moveCar();
        }
    }

    public static void main(String args[]){
        InputView.setCarsQuestion();
        Scanner sc = new Scanner(System.in);
        int numberOfCars = sc.nextInt();
        InputView.setTryQuestion();
        int time = sc.nextInt();
        RacingGame rg = new RacingGame(numberOfCars, time);
        rg.startGame();
        ResultView resultView = new ResultView();
        resultView.result();
        resultView.carsPosition(rg.cars);
    }
}
