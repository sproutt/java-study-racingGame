package RacingGame.Model;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private int numCar;
    private int numTry;
    private List<Car> carArray;


    public int getNumCar() {
        return numCar;
    }

    public int getCarArrayIndex(int index) {
        return carArray.get(index).getCarPosition();
    }

    public void Init(int numCar, int numTry) {
        this.numCar = numCar;
        this.numTry = numTry;
        carArray = new ArrayList<>();
    }

    public List<Car> getCarArray() {
        return carArray;
    }

    public List<Car> settingCar() {

        for (int i = 0; i < numCar; i++) {
            Car car = new Car();
            carArray.add(car);
        }
        return carArray;
    }

    public void tryGame() {
        for (int i = 0; i < numCar; i++) {
            carArray.get(i).moveTry(numTry);
        }
    }
}