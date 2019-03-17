package RacingGame;

public class Car {
    RacingGame racingGame = new RacingGame();
    public int CarStatus(int i){
        int[] car = new int[racingGame.numCar];
        for(int j = 0  ; j < car.length ;j++){
            car[j] = racingGame.PositionCheck(j);
        }
        return car[i];
    }
}
