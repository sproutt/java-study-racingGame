package racingGame.view;

import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    public static int getCarsNumber() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        String carsNumber = scanner.nextLine();
        return Integer.parseInt(carsNumber);
    }

    public static int getTryNumber() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        String tryNumber = scanner.nextLine();
        return Integer.parseInt(tryNumber);
    }
}
