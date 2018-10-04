package view;

import dto.CarDto;
import dto.RacingResult;

public class ResultView {
    private static final char TRACK = '-';

    public static void printResult(RacingResult result) {
        System.out.println("\n실행결과\n");

        for (CarDto carDto : result.getCars()) {
            outputName(carDto.getName());
            outputCarPosition(carDto.getCarPosition());
        }
    }

    public static void outputName(String name) {
        System.out.print(name + " : ");
    }

    public static void outputCarPosition(int carPosition) {

        for (int i = 0; i < carPosition; i++) {
            System.out.print(TRACK);
        }
        System.out.println();
    }

    public static void printWinner(String winners) {
        System.out.print("\n" + winners + "가 최종 우승했습니다.");
    }
}
