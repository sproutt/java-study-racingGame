package racingGame.controller;

import racingGame.model.Car;
import racingGame.view.InputView;
import racingGame.view.OutputView;

import java.util.Random;

public class RacingGameController {
    private static final int MOVE_BOUNDARY = 4;
    private static final int RANDOM_MAX = 10;

    public Car[] makeCars(String[] carNames) {
        Car[] cars = new Car[carNames.length];
        for(int i =0; i<carNames.length; i++){
            cars[i] = new Car(carNames[i]);
        }
        return cars;
    }

    public void moveCars(Car[] cars, int trys) {
        for (int i = 0; i < trys; i++) {
            checkMove(cars[i]);
        }
    }

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(RANDOM_MAX);
    }

    public boolean isMove(int randomNumber) {
        if (randomNumber >= MOVE_BOUNDARY) {
            return true;
        }
        return false;
    }

    public void checkMove(Car car) {
        if (isMove(getRandomNumber())) {
            car.move();
        }
    }
    public String getWinners(Car[] cars){
        String winners = getMaxNumberCarNamesString(cars, getMaxNumber(cars));
        return winners;
    }
    public int getMaxNumber(Car[] cars){
        int maxNumber=cars[0].getPosition();
        for(int i=1; i<cars.length; i++){
            maxNumber = getBiggerNumber(maxNumber, cars[i].getPosition());
        }
        return maxNumber;
    }
    public String getMaxNumberCarNamesString(Car[] cars, int maxNumber){
        String carNamesString="";
        for(int i=0; i<cars.length; i++){
            carNamesString += getNameIfHaveMaxNumber(cars[i], maxNumber);
        }
        return carNamesString.substring(0, carNamesString.length()-2);
    }

    public String getNameIfHaveMaxNumber(Car car, int maxNumber){
        if(car.getPosition() == maxNumber){
            return car.getName()+", ";
        }
        return "";
    }

    public int getBiggerNumber(int originalNumber, int newNumber){
        if(originalNumber < newNumber){
            return newNumber;
        }
        return originalNumber;
    }

    public void playGame() {
        RacingGameController racingGame = new RacingGameController();
        Car[] cars = racingGame.makeCars(InputView.getCarsNames());
        racingGame.moveCars(cars, InputView.getTryNumber());
        OutputView.drawCars(cars);
    }
}
