import java.util.List;

public class RacingGameOutputView {

    public void printCar(List carList) {
        for (int i = 0; i < carList.size(); i++) {
            printCarPosition((int) carList.get(i));
            System.out.println();
        }
    }

    public void printCarPosition(int movement) {
        for (int i = 0; i < movement; i++) {
            System.out.print("-");
        }
    }
}

