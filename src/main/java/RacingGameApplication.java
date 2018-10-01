public class RacingGameApplication {

    public static void main(String[] args) {
        Car car = new Car();
        RacingGameInputView inputView = new RacingGameInputView();
        RacingGameOutputView outputView = new RacingGameOutputView();
        RacingGameController controller = new RacingGameController(car, inputView, outputView);

        int numberOfCars = inputView.inputNumberOfCars();
        int trials = inputView.inputTrials();

        controller.setNumberOfCars(numberOfCars);
        controller.setTrials(trials);
        controller.setCarList();
        outputView.printCar(controller.getCarList());
    }
}
