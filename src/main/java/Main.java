import controller.RacingGame;
import view.InputView;
import view.ResultView;

public class Main {

    public static void main(String args[]){

        RacingGame racingGame= new controller.RacingGame();

        racingGame.set(InputView.setCarsQuestion());
        racingGame.start(InputView.setTimeQuestion());
        ResultView.printResult(racingGame.returnResult());
    }
}
