
public class OutputView {
    private RacingGame racingGame = new RacingGame();

    public void operatingOutput(Car[] car) {
        System.out.println();
        System.out.println("실행결과");
        for (int i = 0; i < car.length; i++) {
            racingGame.printMove(car[i]);
            System.out.println();
        }
    }
}
