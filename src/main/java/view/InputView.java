package view;

import java.util.Scanner;

public class InputView {

    public static int InputNumberOfCars() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return new Scanner(System.in).nextInt();
    }

    public static int InputTime() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return new Scanner(System.in).nextInt();
    }
}
