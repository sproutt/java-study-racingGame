package dto;

import domain.Car;

import java.util.LinkedList;

public class RacingResult {
    private LinkedList<String> winnerList;
    private Car[] cars;

    public RacingResult() {
        this.winnerList = new LinkedList<>();
    }

    public int searchMaxCarPosition() {
        int maxCarPosition = -1;
        for (Car car : cars) {
            maxCarPosition = maxCarPosition < car.getCarPosition() ? car.getCarPosition() : maxCarPosition;
        }
        return maxCarPosition;
    }

    public LinkedList<String> checkWinners(int maxCarPosition) {
        for (Car car : cars) {
            if (maxCarPosition == car.getCarPosition()) {
                winnerList.add(car.getName());
            }
        }
        return winnerList;
    }

    public void updateResult(Car[] cars) {
        this.cars = cars;
        this.winnerList = checkWinners(searchMaxCarPosition());
    }

    public String getWinners() {
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
