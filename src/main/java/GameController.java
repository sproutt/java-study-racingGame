public class GameController {
    private final int RANGE_FROM = 0;
    private final int RANGE_TO = 9;
    private final int BOUNDARY_VALUE = 4;

    private Car[] cars;

    public Car[] setCars(int numberOfCars) {
        cars = new Car[numberOfCars];
        for(int i = 0; i < numberOfCars; i++) {
            cars[i] = new Car();
        }
        return cars;
    }

    public boolean isWon() {
        double randomValue = Math.random();
        return ((int)(randomValue * RANGE_TO) + RANGE_FROM >= BOUNDARY_VALUE) ? true : false;
    }

    public void doGame(int numberOfCar, int numberOfRound) {
        for(int i = 0; i < numberOfCar; i++) {
            for(int j = 0; j < numberOfRound; j++)
                if(isWon()) { cars[i].move(); }
        }
    }
}
