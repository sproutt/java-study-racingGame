package racingGame.view;

public class OutputView {
    private static final String RESULT_MESSAGE = "\n실행결과\n";

    public static void drawResultMessage(String[] results) {
        System.out.println(RESULT_MESSAGE);
        drawCars(results[0]);
        drawWinner(results[1]);
    }

    public static void drawCars(String Traces) {
        System.out.println(Traces);
    }

    public static void drawWinner(String winners) {
        System.out.println(winners + "가 최종 우승했습니다.");
    }

}
