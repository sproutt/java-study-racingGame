package dto;

import domain.Car;

import java.util.LinkedList;

public class RacingResult {
    private LinkedList<String> winnerList;
    private Car[] cars;

    public RacingResult(Car[] cars) {
        this.winnerList = new LinkedList<>();
        this.cars = cars;
    }

    public void findWinners() {
        int max_CarPosition = -1;
        for (Car car : cars) {
            max_CarPosition = max_CarPosition < car.getCarPosition() ? car.getCarPosition() : max_CarPosition;
        }
        for (Car car : cars) {
            checkWinner(car, max_CarPosition);
        }
    }

    public void checkWinner(Car car, int max_CarPosition) {
        if (max_CarPosition == car.getCarPosition()) {
            winnerList.add(car.getName());
        }
    }

    public String getWinners() {
        findWinners();
        StringBuilder winners = new StringBuilder(winnerList.pop());
        while (!winnerList.isEmpty()) {
            winners.append(", " + winnerList.pop());
        }
        return winners.toString();
    }

    public CarDto[] getCars() {
        CarDto[] carDtos = new CarDto[cars.length];
        for (int i = 0; i < cars.length; i++) {
            carDtos[i] = new CarDto(cars[i]);
        }
        return carDtos;
    }
}
