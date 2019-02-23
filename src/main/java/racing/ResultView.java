package racing;

public class ResultView {
    public static void printResult(int[] carPositions) {
        for (int i = 0; i < carPositions.length; i++) {
            String result = new String(new char[carPositions[i]]).replace("\0", "-");
            System.out.println(result);
        }
    }
}
