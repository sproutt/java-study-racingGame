import java.util.Scanner;

public class RacingGameInputView {
    private Scanner scanner = new Scanner(System.in);

    public int inputNumberOfCars() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        int numberOfCars = scanner.nextInt();
        return numberOfCars;
    }

    public int inputTrials() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        int trials = scanner.nextInt();
        return trials;
    }
}
