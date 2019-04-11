package view;

import model.Car;
import model.RacingGame;

import java.util.List;

public class ResultView {

    private static final char HYPHEN = '-';

    public static void showRacingCarResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.showTrack(HYPHEN));
        }
    }



}