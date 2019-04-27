package view;

import java.util.Scanner;

public class InputView {

    public static int InputNumberOfAttempts() {
        System.out.print("시도할 횟수는 몇 회 인가요? ");
        return new Scanner(System.in).nextInt();
    }

    public static String InputName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)>>");
        return new Scanner(System.in).nextLine();
    }
}
