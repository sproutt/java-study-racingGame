package view;

import java.util.List;

public class ResultView {

    private static final char HYPHEN = '-';

    public static void showRacingCarResult(List<Integer> carRecord) {
        for (Integer record : carRecord) {
            printCarPosition(record);
            System.out.println();
        }
    }

    public static void printCarPosition(int record) {
        for (int i=0; i<record; i++) {
            System.out.print(HYPHEN);
        }
    }
}
