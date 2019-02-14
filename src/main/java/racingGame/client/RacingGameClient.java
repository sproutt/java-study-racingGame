package racingGame.client;

import racingGame.controller.RacingGameController;
import racingGame.view.InputView;
import racingGame.view.OutputView;

public class RacingGameClient {

    public static void main(String[] args) {
        RacingGameController racingGameController = new RacingGameController();
        racingGameController.set(InputView.getCarsNames());
        racingGameController.start(InputView.getTryNumber());
        racingGameController.drawResults();
    }

}
