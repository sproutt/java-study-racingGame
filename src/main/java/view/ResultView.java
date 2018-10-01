package view;

public class ResultView {
    private static char MOVE = '-';

    public static void printResult(int[] carPositions) {
        System.out.println("\n실행결과\n");
        for (int i = 0; i < carPositions.length; i++) {
            outputOneOfCar(carPositions[i]);
        }
    }

    public static void outputOneOfCar(int carPosition) {
        for (int i = 0; i < carPosition; i++) {
            System.out.print(MOVE);
        }
        System.out.println();
    }
}
