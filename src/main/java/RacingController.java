import java.util.*;

public class RacingController {
    private Car car;
    private InputView inputView;
    private ResultView resultView;

    public RacingController(Car car, InputView inputView, ResultView resultView) {
        this.car = car;
        this.inputView = inputView;
        this.resultView = resultView;
    }


    public int[] move() {
        int[] carPositions = car.getCarPositions();

        for (int i = 0; i < carPositions.length; i++) {
            carPositions[i] += FowardAndStop();
        }
        return carPositions;
    }

    public void racing() {
        int[] carPositions = car.getCarPositions();
        int time = car.getTime();

        for (int i = 0; i < time; i++) {
            carPositions = move();
        }
        car.setCarPositions(carPositions);
    }

    public int FowardAndStop() {
        Random random = new Random();
        int number = random.nextInt(10);
        if(number < 4) return 0;

        return 1;
    }

    public void input() {
        car.setTime(inputView.inputTime());
        car.makeCarPositions(inputView.inputNumberOfCar());
    }

    public void printResult() {
        resultView.printResult(car.getCarPositions());
    }
}
