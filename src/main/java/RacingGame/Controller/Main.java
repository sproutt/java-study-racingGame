package RacingGame.Controller;


import RacingGame.Model.RacingGame;
import RacingGame.Util.InputView;
import RacingGame.Util.ResultView;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        RacingGame racingGame = new RacingGame();
        ResultView resultView = new ResultView();
        racingGame.Init(inputView.InputCar(), inputView.InputTry());
        racingGame.settingCar();
        racingGame.tryGame();
        resultView.readCar(racingGame.getCarArray());
    }
}