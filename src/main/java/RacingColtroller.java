import utils.*;

public class RacingColtroller {
    private Car car[];
    private InputView inputView;
    private ResultView resultView;
    private static int FORWARDCRITERIA = 4;

    public RacingColtroller() {
    }

    public RacingColtroller(Car car[], InputView inputView, ResultView resultView) {
        this.car = car;
        this.inputView = inputView;
        this.resultView = resultView;
    }

    public boolean isForward() {
        RandomValueGenerator randomNumberGenerator = new RandomValueGenerator();
        int randomNumber = randomNumberGenerator.returnRandomInt();
        if (randomNumber >= FORWARDCRITERIA)
            return true;
        return false;
    }

    public void forwardOrStay(int repeatTimes, int carIndex) {
        for (int j = 0; j < repeatTimes; j++)
            repeatProcess(carIndex);
    }

    public void repeatProcess(int carIndex) {
        if (isForward())
            car[carIndex].move();
    }
}


