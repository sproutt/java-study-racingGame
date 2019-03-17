package RacingGame;

public class ResultView {
    Car car = new Car();
    RacingGame racingGame = new RacingGame();
    private static final char moved = '-';

    public void PrintCar(){
        System.out.println("실행결과");
        for(int i = 0 ; i < racingGame.numCar ;i++){
            PrintCarPosition(i);
        }
    }
    public void PrintCarPosition(int i){
        for(int j = 0 ; j < car.CarStatus(i) ; j++){
            System.out.print(moved);
        }
        System.out.println();
    }
}
