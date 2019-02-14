package racingGame.view;

import racingGame.model.CarDto;

public class OutputView {
    private static final char TRACE = '-';
    private static final String RESULT_MESSAGE="\n실행결과\n";

    public static void drawResultMessage(String[] results){
        System.out.println(RESULT_MESSAGE);
        drawCars(results[0]);
        drawWinner(results[1]);
    }

    public static void drawCars(String Traces) {

//        for (int i = 0; i < carDtos.length; i++) {
//            System.out.print(carDtos[i].getName() + " : ");
//            drawTrace(carDtos[i].getPosition());
//        }
        System.out.println(Traces);
    }

    public static void drawTrace(int traceCount) {
        for (int i = 0; i < traceCount; i++) {
            System.out.print(TRACE);
        }
        System.out.println("");
    }

    public static void drawWinner(String winners) {
        System.out.println(winners + "가 최종 우승했습니다.");
    }

}
