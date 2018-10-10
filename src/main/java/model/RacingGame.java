package model;

import utils.RandomValueGenerator;
import utils.CompareTwoIntegers;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private static final int BOUNDARY_VALUE = 4;
    private Car[] car;
    private List<String> winners = new ArrayList<>();

    public Car[] makeCar(String cars) {
        String[] names = cars.split(",");
        car = new Car[names.length];
        for (int i = 0; i < names.length; i++) {
            car[i] = new Car();
            car[i].setRacer(names[i]);
        }
        return car;
    }

    public int judgeMovement() {
        if (RandomValueGenerator.getRandomNumber() < BOUNDARY_VALUE) return 0;
        return 1;
    }

    public int moveCar(int count) {
        int position = 0;
        for (int i = 0; i < count; i++) {
            position += judgeMovement();
        }
        return position;
    }

    public void startRace(Car[] car, int count) {
        for (int i = 0; i < car.length; i++) {
            car[i].setPosition(moveCar(count));
        }

    }

    public int getWinnersPosition(Car[] car) {
        int winner = car[0].getPosition();
        for (int i = 1; i < car.length; i++) {
            winner = CompareTwoIntegers.compareTwoIntegers(winner, car[i].getPosition());
        }
        return winner;
    }

    public void foundWinnerPosition(Car[] car, int winnerPosition) {
        for (int i = 0; i < car.length; i++) {
            isWinner(car[i], winnerPosition);
        }
    }

    public void isWinner(Car car, int winnerPosition) {
        if (car.getPosition() == winnerPosition)
            winners.add(car.getRacer());
    }

    public void printWinner() {
        for (int i = 0; i < winners.size() - 1; i++) {
            System.out.print(winners.get(i) + ", ");
        }
        System.out.print(winners.get(winners.size() - 1) + "(이)가 최종 우승했습니다.");
    }
}