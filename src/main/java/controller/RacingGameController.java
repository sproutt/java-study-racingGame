package controller;

import model.Game;
import view.InputView;
import view.ResultView;
import java.util.Scanner;

public class RacingGameController {

    private Game game;
    private InputView inputView;
    private ResultView resultView;
    private Scanner sc = new Scanner(System.in);


    public RacingGameController() {
        game = new Game();
        inputView = new InputView();
        resultView = new ResultView();
    }

    public void setGame(){
        inputView.setCarsQuestion();
        game.setNumberOfCars(sc.nextInt());
        inputView.setTryQuestion();
        game.setTime(sc.nextInt());
    }

    public void startGame(){
        if(game.isEnd()) // error message
        game.start();
    }

    public void printResult(){
        if(!game.isEnd()) // error message
        resultView.printResult(game.getCars());
    }

}
