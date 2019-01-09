import java.util.Random;
import java.util.Scanner;

public class RacingGame<puiblic> {

    private int[] carPositions;
    private int tryNumber;

    public void setTryNumber(int tryNumber) {
        this.tryNumber = tryNumber;
    }

    public void setCarNumber(int carNumber) {
        carPositions = new int[carNumber];
    }

    private void inputCarNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇대인가요?");
        int carNumber = scanner.nextInt();
        setCarNumber(carNumber);
    }

    private void inputTryNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 회수는 몇대인가요?");
        int tryNumber = scanner.nextInt();
        setTryNumber(tryNumber);
    }

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public int goOrStop(int randomNumber) {
        if (randomNumber >= 4) {
            return 1;
        }
        return 0;
    }

    public int makeIndividualPosition() {
        int individualPosition = 0;
        for (int i = 0; i < tryNumber; i++) {
            individualPosition = individualPosition + goOrStop(getRandomNumber());
        }
        return individualPosition;
    }

    public void makePositions() {
        for (int i = 0; i < carPositions.length; i++) {
            carPositions[i] = makeIndividualPosition();
        }
    }

    public String makePositionString(int individualPosition) {
        String positionString = "";
        for (int i = 0; i < individualPosition; i++) {
            positionString = positionString + "-";
        }
        return positionString;
    }

    public void printResult() {
        for (int i = 0; i < carPositions.length; i++) {
            System.out.println(makePositionString(carPositions[i]));
        }
    }

    public void playRaciongGame() {
        inputCarNumber();
        inputTryNumber();
        makePositions();
        printResult();
    }

}
