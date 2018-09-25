package racingGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car {
    private List cars;
    private int trials;

    public void setCars(int cars) {
        this.cars = new ArrayList<Integer>();

        for (int i = 0; i < cars; i++) {
            this.cars.add(0);
        }
    }

    public List getCars() {
        return cars;
    }

    public void setTrials(int trials) {
        this.trials = trials;
    }

    public int getTrials() {
        return trials;
    }

    public int makeRandomNumber() {
        long seed = System.currentTimeMillis();
        Random randomNumber = new Random(seed);
        return randomNumber.nextInt(10);
    }

    public int checkMoveCondition(int number) {
        if (number >= 4) {
            return 1;
        }
        return 0;
    }

    public int adaptMoveCondition() {
        int counter = 0;
        int trials = getTrials();

        for (int i = 0; i < trials; i++) {
            int number = makeRandomNumber();

            counter += checkMoveCondition(number);
            getSleep();
        }
        return counter;
    }

    // 난수 중복 방지용 메소드
    private void getSleep() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 모든 대 수의 차에 대한 움직임
    public List moveCars() {
        cars = getCars();

        for (int i = 0; i < cars.size(); i++) {
            cars.set(i, adaptMoveCondition());
        }

        return cars;
    }

    // 한 대의 차에 대한 움직임
    public void moveCar(int movement) {
        for (int i = 0; i < movement; i++) {
            System.out.print("-");
        }
    }

    public void getResult(List cars) {
        for (int i = 0; i < cars.size(); i++) {
            moveCar((int) cars.get(i));
            System.out.println();
        }
    }
}


