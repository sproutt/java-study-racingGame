package racingGame;

import racingGame.Car;

public class RacingGameController {
    private Car model;
    private RacingGameView view;



    public RacingGameController(Car model, RacingGameView view) {
        this.model = model;
        this.view = view;
    }

    public void outputView() {
        view.getOutput();
        model.getResult(model.moveCars());
    }

    public void inputView() {
        model = new Car();
        model.setCars(view.inputCarCounts());
        model.setTrials(view.inputTrialCounts());
    }

}
