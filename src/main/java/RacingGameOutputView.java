import java.util.List;

public class RacingGameOutputView {

    public static void printCars(List carList) {
        for (int i = 0; i < carList.size(); i++) {
            printCarPosition((Car) carList.get(i));
            System.out.println();
        }
    }

    private static void printCarPosition(Car car) {
        for (int i = 0; i < car.getCarPosition(); i++) {
            System.out.print("-");
        }
    }
}

