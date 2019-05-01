package racinggame.javajigi_racingGame;

import racinggame.javajigi_racingGame.domain.RacingGame;
import racinggame.javajigi_racingGame.dto.RacingResult;
import racinggame.javajigi_racingGame.view.InputView;
import racinggame.javajigi_racingGame.view.ResultView;

public class RacingMain {
    public static void main(String[] args) {
        String carNames = InputView.getCarNames();
        int tryNo = InputView.getTryNo();

        RacingGame racingGame = new RacingGame(carNames);
        RacingResult result = racingGame.racing(tryNo);

        ResultView.printResult(result);
    }
}