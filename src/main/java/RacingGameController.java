import java.util.ArrayList;
import java.util.List;

public class RacingGameController {
    private RacingGameOutputView outputview;
    private RacingGameInputView inputView;
    private Car car;
    private int trials;
    private int numberOfCars;
    private List carList;

    public RacingGameController(Car car, RacingGameInputView inputView, RacingGameOutputView outputView) {
        this.car = car;
        this.inputView = inputView;
        this.outputview = outputView;
    }

    public void setTrials(int trials) {
        this.trials = trials;
    }


    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public void setCarList() {
        carList = new ArrayList();
        for (int i = 0; i < numberOfCars; i++) {
            car.setCarPosition(trials);
            carList.add(car.getCarPosition());
        }
    }

    public List getCarList() {
        return carList;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public int getTrials() {
        return trials;
    }
}
