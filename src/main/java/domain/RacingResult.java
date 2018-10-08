package domain;

import dto.CarDto;

import java.util.*;

public class RacingResult {
    private Queue<String> winnerList;
    private List<CarDto> carDtos;

    public RacingResult() {
        this.winnerList = new LinkedList<>();
        this.carDtos = new ArrayList<>();
    }

    public int searchMaxCarPosition() {
        int maxCarPosition = -1;
        for (CarDto carDto : carDtos) {
            maxCarPosition = maxCarPosition < carDto.getCarPosition() ? carDto.getCarPosition() : maxCarPosition;
        }
        return maxCarPosition;
    }

    public Queue<String> checkWinners(int maxCarPosition) {
        for (CarDto carDto : carDtos) {
            if (maxCarPosition == carDto.getCarPosition()) {
                winnerList.add(carDto.getName());
            }
        }
        return winnerList;
    }

    public void updateResult(List<Car> cars) {
        List<CarDto> carDtosTemp = new ArrayList<>();
        CarDto carDto;
        for (int i = 0; i < cars.size(); i++) {
            carDto = new CarDto(cars.get(i));
            carDtosTemp.add(carDto);
        }
        this.carDtos = carDtosTemp;
        this.winnerList = checkWinners(searchMaxCarPosition());
    }

    public String getWinners() {
        StringBuilder winners = new StringBuilder(winnerList.poll());
        while (!winnerList.isEmpty()) {
            winners.append(", " + winnerList.poll());
        }
        return winners.toString();
    }

    public List<CarDto> getCars() {
        return carDtos;
    }
}
