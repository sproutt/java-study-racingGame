import java.util.*;

public class InputView {


    public int inputNumberOfCar(Scanner scanner) {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    public int inputTime(Scanner scanner) {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }

    public RacingGame input() {
        RacingGame racingGame = new RacingGame();
        Scanner scanner = new Scanner(System.in);
        racingGame.setTime(inputTime(scanner));
        racingGame.makeCarPositions(inputNumberOfCar(scanner));

        return racingGame;
    }
}
