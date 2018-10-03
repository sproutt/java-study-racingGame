public class ResultView {

    public void printResult(Car[] car) {
        System.out.println("실행 결과");
        printAllCarsMovement(car);
        System.out.println();
    }

    public void printAllCarsMovement(Car[] car) {
        for (int i = 0; i < car.length; i++)
            printEachCarMovement(car[i]);
    }

    public void printEachCarMovement(Car car) {
        for (int i = 0; i < car.getCarPosition(); i++)
            System.out.print("-");
        System.out.println();
    }

}
