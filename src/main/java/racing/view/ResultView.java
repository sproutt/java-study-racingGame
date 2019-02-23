package racing.view;

import java.util.ArrayList;

public class ResultView {
    public static void printResult(ArrayList<Integer> carPositions) {
        for (int distance : carPositions) {
            System.out.println(showDistance(distance));
        }
    }

    private static String showDistance(int distance) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < distance; i++) {
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}
