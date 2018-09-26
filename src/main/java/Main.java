import view.InputView;
import view.ResultView;

public class Main {

    public static void main(String args[]){

        controller.RacingGame racingGame= new controller.RacingGame();
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        racingGame.set(inputView.setCarsQuestion());
        racingGame.start(inputView.setTimeQuestion());

        resultView.printResult(racingGame.returnResult());
    }
}
