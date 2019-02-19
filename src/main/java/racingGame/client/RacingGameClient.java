package racingGame.client;

import racingGame.domain.RacingGame;
import racingGame.view.InputView;
import racingGame.view.OutputView;

public class RacingGameClient {

    public static void main(String[] args) {

        RacingGame racingGame = new RacingGame();
        racingGame.makeCars(InputView.getCarsNames());
        String[] results = racingGame.play(InputView.getTryNumber());
        OutputView.drawResultMessage(results);
    }
}
