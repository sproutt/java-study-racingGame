import java.util.Scanner;

public class RacingGameInput {

    private RacingGameTools racingGameTools = new RacingGameTools();

    public RacingGameTools setting() {
        carNumber();
        tryNumber();
        return racingGameTools;
    }

    private void carNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇대인가요?");
        racingGameTools.carPositions = new int[scanner.nextInt()];
    }

    private void tryNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 회수는 몇대인가요?");
        racingGameTools.tryNumber = scanner.nextInt();
    }

}
