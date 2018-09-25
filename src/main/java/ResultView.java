public class ResultView {

    public void printResult(int[] carPositions) {
        System.out.println();
        System.out.println("실행결과");
        System.out.println();
        for (int i = 0; i < carPositions.length; i++) {
            outputOneCar(carPositions[i]);
        }
    }

    public void outputOneCar(int carPosition) {
        for (int i = 0; i < carPosition; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
