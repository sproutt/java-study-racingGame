public class OutputView {
    public void printDistanceOfCar(int distanceOfCar) {
        for(int i = 0; i < distanceOfCar; i++) {
            System.out.print("-");
        }
    }

    public void printResults(Car[] cars) {
        System.out.println();
        System.out.println("실행 결과");
        for(int i = 0; i < cars.length; i++) {
            printDistanceOfCar(cars[i].getDistance());
            System.out.println();
        }
    }
}
