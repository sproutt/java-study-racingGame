public class Main {

    public static void main(String[] args) {
        Car[] car;
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        RacingGame racingGame = new RacingGame();
        int num = inputView.inputCars();
        car = racingGame.makeCar(num);
        int count = inputView.inputCounts();
        for (int i = 0; i < num; i++) {
            int position = racingGame.move(count);
            car[i].setPosition(position);
        }
        outputView.operatingOutput(car);
    }
}

