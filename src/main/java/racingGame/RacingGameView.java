package racingGame;

import java.util.Scanner;

public class RacingGameView {
    public int inputCarCounts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    public int inputTrialCounts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }

    public void getOutput() {
        System.out.println("실행 결과");
    }
}
