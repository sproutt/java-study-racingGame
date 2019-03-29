package racingGame.util;

import java.util.Scanner;

public class InputView {
    public static int inputCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    public static int inputTry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 횟수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}