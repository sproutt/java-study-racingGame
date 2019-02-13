package racingGame.client;

import racingGame.controller.RacingGameController;
import racingGame.model.Car;
import racingGame.view.InputView;
import racingGame.view.OutputView;

public class RacingGameClient {

    public static void main(String[] args) {
        RacingGameController racingGameController = new RacingGameController();
        racingGameController.start(InputView.getCarsNames(),InputView.getTryNumber());
    }

}
