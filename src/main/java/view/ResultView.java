package view;

import domain.Car;

import java.util.*;

public class ResultView {
    private static char MOVE = '-';

    public static void printResult(Car[] cars) {
        System.out.println("\n실행결과\n");
        for (int i = 0; i < cars.length; i++) {
            outputName(cars[i]);
            outputCarPosition(cars[i]);
        }
    }

    public static void outputCarPosition(Car car) {

        for (int i = 0; i < car.getCarPosition(); i++) {
            System.out.print(MOVE);
        }
        System.out.println();
    }

    public static void outputName(Car car) {
        System.out.print(car.getName() + " : ");
    }

    public static void printWinner(ArrayList<String> winners) {
        StringBuilder stringBuilder = new StringBuilder(winners.);
        // 여기서 멈춤

        for (String winner: winners) {
            System.out.print(winner);
        }
        System.out.print("최종 우승했습니다.");
    }
}
