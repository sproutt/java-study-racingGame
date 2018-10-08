package view;

import model.Car;

import java.util.List;

public class RacingGameOutputView {

    public static void printCars(List carList) {
        System.out.println("\n실행 결과\n");
        for (int i = 0; i < carList.size(); i++) {
            printCarPosition((Car) carList.get(i));
            System.out.println();
        }
    }

    private static void printCarPosition(Car car) {
        System.out.print(car.getCarName() + " : ");
        for (int i = 0; i < car.getCarPosition(); i++) {
            System.out.print("-");
        }
    }

    public static void printWinner(String winnerNames) {
        System.out.println("\n" + winnerNames + "가 최종 우승했습니다.");
    }
}

