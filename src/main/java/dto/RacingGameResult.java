package dto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGameResult {

    private static final String TRACK = "-";

    private List<CarDTO> cars;

    public RacingGameResult(List<CarDTO> cars) {
        this.cars = cars;
    }

    public void visualize() {
        for (CarDTO car : cars) {
            car.drawCarTrack(TRACK);
        }
    }

    public List<String> getWinnersName(){
        List<CarDTO> sortedCar = sortCars();
        List<CarDTO> winners = findWinners(sortedCar, getFirstCar(sortedCar));

        return winners.stream()
                        .map(CarDTO::getName)
                        .collect(Collectors.toList());
    }

    private List<CarDTO> findWinners(List<CarDTO> sortedCar, int maxDistance) {
        List<CarDTO> winners = new ArrayList<>();
        for (CarDTO carDTO : sortedCar) {
            if(!isMaxDistance(maxDistance, carDTO)) {
                break;
            }
            winners.add(carDTO);
        }
        return winners;
    }

    private boolean isMaxDistance(int maxDistance, CarDTO carDTO) {
        return carDTO.getDistance() == maxDistance;
    }

    private int getFirstCar(List<CarDTO> sortedCar) {
        return sortedCar.get(0).getDistance();
    }

    private List<CarDTO> sortCars() {
        return cars.stream()
                        .sorted(Comparator.comparing(CarDTO::getDistance)
                        .reversed())
                        .collect(Collectors.toList());
    }
}
