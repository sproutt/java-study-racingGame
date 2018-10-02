package domain;

import java.util.List;

public class RacingGameResult {

    private static final String TRACK = "-";

    private List<Car> cars;

    public RacingGameResult(List<Car> cars) {
        this.cars = cars;
    }

    public void visualize() {
        for (Car car : cars) {
            printCarTrack(car);
        }
    }

    public void printCarTrack(Car car) {
        for (int i = 0; i < car.getDistance(); i++) {
            System.out.print(TRACK);
        }
        System.out.println();
    }
}
