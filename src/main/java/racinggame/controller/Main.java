package racinggame.controller;

import racinggame.model.Car;
import racinggame.model.RacingGame;
import racinggame.model.WinnerGenerator;
import racinggame.util.InputView;
import racinggame.util.ResultView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        WinnerGenerator winnerGenerator = new WinnerGenerator();

        racingGame.settingCar(InputView.inputCar());  //main 에서도 변수를 활용하자 String carNames = InputView.getCarNames(); 처럼
        List<Car> finishedCars = racingGame.tryAllCarGame(InputView.inputTry()); // 여기서도 InputView.inputTry를 애당초 int tryNo = InputView.getTryNo(); 이런 식으로 활용 했었어야 했다.
        ResultView.printResult(finishedCars);
        ResultView.printWinner(winnerGenerator.makeWinners(finishedCars));

        //느낀점 내가 짠 main은 작성한 메소드를 불러오기에만 급급했다. main 내에서도 변수에 할당 하면 좀더 편했을 것 같다.
    }
}