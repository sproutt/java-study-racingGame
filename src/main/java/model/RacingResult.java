package model;

public class RacingResult {
    private Car[] cars;

    public Car[] getCars() {
        return cars;
    }

    public RacingResult(Car[] car) {
        this.cars = car;
    }

    public static void printMove(Car car) {
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print("-");
        }
    }


}
