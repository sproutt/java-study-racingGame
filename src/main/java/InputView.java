import java.util.*;

public class InputView {

    public int inputNumberOfCar() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return new Scanner(System.in).nextInt();
    }

    public int inputTime() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return new Scanner(System.in).nextInt();
    }
}
