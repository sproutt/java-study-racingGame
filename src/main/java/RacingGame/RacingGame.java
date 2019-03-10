package RacingGame;

import java.util.Random;
import java.util.Scanner;


public class RacingGame {
    final int isMove = 4;
    final int canMove = 1;
    final int canNotMove = 0;

    public void inputCondition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int numberOfCar = scanner.nextInt();
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int numberOfTry = scanner.nextInt();
        System.out.println("실행결과");
        for (int i = 0; i < numberOfCar; i++) {
            printResult(numberOfTry);
        }
    }

    public void printResult(int numberOfTry) {
        for (int j = 0; j < numberOfMovedCount(numberOfTry); j++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public int numberOfMovedCount(int numberOfTry) {
        int movedCount = 0;
        for (int i = 0; i < numberOfTry; i++) {
            movedCount += checkMove();
        }
        return movedCount;
    }

    public int checkMove() {
        if (randomGenerator() >= isMove) {
            return canMove;
        }
        return canNotMove;
    }

    public int randomGenerator() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
