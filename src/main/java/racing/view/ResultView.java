package racing.view;

public class ResultView {
    public static void printResult(int[] carPositions) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < carPositions.length; i++) {
            stringBuilder.append("-");
        }
        System.out.println(stringBuilder.toString());
    }
}
