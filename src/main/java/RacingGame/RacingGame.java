package RacingGame;

public class RacingGame {
    final int moveRestriction = 4;
    final int canMove = 1;
    final int canNotMove = 0;

    InputView inputView = new InputView();
    Utils utils = new Utils();
    public int numCar = inputView.InputCar();
    public int numTry = inputView.InputTry();

    public int PositionCheck(int index) {

        int[] positionArray = new int[numCar];
        for (int i = 0; i < positionArray.length; i++) {
            positionArray[i] = Car();
        }
        return positionArray[index];
    }

    private int Car() {
        int carPosition = CarMove();
        return carPosition;
    }

    private int CarMove() {
        int moveCount = 0;
        for (int i = 0; i < numTry; i++) {
            moveCount += CheckMove();
        }
        return moveCount;
    }

    private int CheckMove() {
        if (utils.randomGenerator() >= moveRestriction) {
            return canMove;
        }
        return canNotMove;
    }
}
