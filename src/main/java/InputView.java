import java.util.*;

public class InputView {
    Scanner scanner = new Scanner(System.in);
    public int inputCarNumber(){
        int carNumber;
        System.out.println("자동차 대수는 몇 대 인가요?");
        carNumber = scanner.nextInt();
        return carNumber;
    }
    public int inputRepeatTimes(){
        int repeatTimes;
        System.out.println("시도할 회수는 몇 회 인가요?");
        repeatTimes = scanner.nextInt();
        return repeatTimes;
    }
}
