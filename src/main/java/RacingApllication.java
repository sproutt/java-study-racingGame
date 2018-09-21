public class RacingApllication {
    public static void main(String[] args) {
        RacingGame model = inputModel();



    }

    private static RacingGame inputModel(){
        RacingGame racingGame = new RacingGame();
        InputView inputView = new InputView();
        racingGame = inputView.input();

        return racingGame;
    }

}
