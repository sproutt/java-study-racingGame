import controller.RacingGameController;

public class RacingGame {

    public static void main(String args[]){
        RacingGameController gameController = new RacingGameController();

        gameController.setGame();
        gameController.startGame();
        gameController.printResult();
    }
}
