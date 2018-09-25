package racingGame;

import racingGame.Car;

public class RacingGameApplication {

    public static void main(String[] args) {
        Car model = new Car();
        RacingGameView view = new RacingGameView();
        RacingGameController controller = new RacingGameController(model, view);

        controller.inputView();
        controller.outputView();
    }
}
