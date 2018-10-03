package view;

import java.util.Scanner;

public class RacingGameInputView {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputNumberOfCars() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carsNameString = scanner.nextLine();
        return carsNameString;
    }

    public static int inputTrials() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        int trials = scanner.nextInt();
        return trials;
    }
}
