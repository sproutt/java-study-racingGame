import java.util.Scanner;

public class RacingGameInputView {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputNumberOfCars() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        int numberOfCars = scanner.nextInt();
        return numberOfCars;
    }

    public static int inputTrials() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        int trials = scanner.nextInt();
        return trials;
    }
}
