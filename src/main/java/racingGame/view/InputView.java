package racingGame.view;

import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    private int getCarsNumber() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        String carsNumber = scanner.nextLine();
        return Integer.parseInt(carsNumber);
    }

    private int getTryNumber() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        String tryNumber = scanner.nextLine();
        return Integer.parseInt(tryNumber);
    }
}
